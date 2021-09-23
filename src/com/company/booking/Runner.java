package com.company.booking;

import java.util.List;
import java.util.Scanner;

public class Runner{
    public static void main(String [] args){
        List<Taxi> taxi=CreateTaxi.createTaxi(4);
        int id=1;
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("         CALL TAXI BOOKING     ");
            System.out.println(" 1)Booking");
            System.out.println(" 2)Display");
            System.out.println(" 3)Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    CustomerInputForBooking input = new CustomerInputForBooking();
                   boolean val= input.getInputForBooking(taxi,id);
                   if(!val){
                        System.out.println("No taxi available");
                        return;
                    }
                    id++;
                    break;
                case 2:

                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
