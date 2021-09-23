package com.company.booking;

public class PrintDetails {
      public static void printDetails(){
          Taxi tax=new Taxi();
          System.out.println("Taxi-"+tax.getTaxiId()+" "+"Total earnings"+tax.getTotalEarnings());
          System.out.println("TaxiID    BookingID    CustomerID    From    To    PickupTime    DropTime    Amount");
      }
}
