package com.company.booking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CustomerInputForBooking {
     static Scanner sc=new Scanner(System.in);
    public static boolean getInputForBooking(List<Taxi> taxi,int customerId){
       /* System.out.println("Enter the customer Id:");
        int customerId=sc.nextInt();*/
       // int newId=customerId;
        System.out.println("Enter the pickup point:");
        char pickUpPoint=getPoint(sc.next().charAt(0));
        System.out.println("Enter the drop point:");
        char dropPoint=getPoint(sc.next().charAt(0));
        System.out.println("Enter the pickup time:");
        int pickUpTime=sc.nextInt();
        Booking booking=new Booking();
        booking.setCustomerId(customerId);
        booking.setPickUpPoint(pickUpPoint);
        booking.setDropPoint(dropPoint);
        booking.setPickUpTime(pickUpTime);
        int freeTime=6;
        char currentSpot='A';
        double totalEarnings=0.0;
        Taxi tax=new Taxi();
        tax.setFreeTime(freeTime);
        tax.setCurrentSpot(currentSpot);
        tax.setTotalEarnings(totalEarnings);
        System.out.println("free time"+tax.getFreeTime());
        System.out.println("current spot"+tax.getCurrentSpot());
        MakeTaxiBooking make=new MakeTaxiBooking();
        boolean val= make.bookTaxi(taxi);
        return val;
    }
    public static char getPoint(char c){
        if(c>'A'||c<'F'){
            return c;
        }
            System.out.println("Valid points are A,B,C,D,E,F");
            System.out.println("Enter Valid Point:");
            char ch=sc.next().charAt(0);
            return ch;
    }
}
