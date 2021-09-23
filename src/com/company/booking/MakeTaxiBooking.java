package com.company.booking;

import java.util.Collections;
import java.util.List;

public class MakeTaxiBooking {
      public boolean bookTaxi(List<Taxi> taxis){
          Taxi tax=new Taxi();
          Booking book=new Booking();
          int customerId= book.getCustomerId();
          int pickUpTime=book.getPickUpTime();
          char pickUpPoint=book.getPickUpPoint();
          char dropPoint=book.getDropPoint();
          int min=999;
          int disBwPickUpAndDrop=0;
          double earnings=0.0;
          int nextFreeTime=0;
          char nextSpot='Z';
          Taxi bookedTaxi=null;
          String tripDetail="";
          List<Taxi> freeTaxis=CreateTaxi.getFreeTaxis(taxis,pickUpTime,pickUpPoint);
          if(freeTaxis.size()==0){
              return false;
          }
          //Collections.sort(freeTaxis,(a, b)-> (int) (a.getTotalEarnings ()- b.getTotalEarnings()));
          for(Taxi t:freeTaxis){
                 int disBwCusAndTaxi=Math.abs((tax.getCurrentSpot()-'0')-(pickUpPoint-'0'))*15;
                 if(disBwCusAndTaxi<min){
                     bookedTaxi=t;
                     disBwPickUpAndDrop=Math.abs((dropPoint-'0')-(pickUpPoint-'0'))*15;
                     earnings=(disBwPickUpAndDrop-5)*10+100;
                     int dropTime=pickUpTime+disBwPickUpAndDrop/15;
                     nextFreeTime=dropTime;
                     nextSpot=dropPoint;
                     tripDetail=customerId+"   "+customerId+"   "+pickUpPoint+"    "+dropPoint+"   "+pickUpTime+"    "+dropTime+"    "+earnings;
                     min=disBwCusAndTaxi;
                 }
          }
          tax.setCurrentStatus(true);
          tax.setCurrentSpot(nextSpot);
          tax.setFreeTime(nextFreeTime);
          tax.setTotalEarnings(tax.getTotalEarnings()+earnings);
          tax.setTrip(tripDetail);
          System.out.println("Taxi-"+tax.getTaxiId()+"  booked");
          return true;
      }
}
