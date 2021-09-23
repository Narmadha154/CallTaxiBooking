package com.company.booking;

import java.util.ArrayList;
import java.util.List;

public class CreateTaxi {
    public static List<Taxi> createTaxi(int number){
        List<Taxi> taxis=new ArrayList<>();
        for(int i=1;i<=number;i++){
            Taxi t=new Taxi();
            taxis.add(t);
        }
        return taxis;
    }
    public static List<Taxi> getFreeTaxis(List<Taxi> taxis,int pickUpTime,char pickUpPoint){
        Taxi taxi=new Taxi();
        int freeTime=taxi.getFreeTime();
        char currentSpot=taxi.getCurrentSpot();
       System.out.println("free"+freeTime);
        System.out.println("current"+currentSpot);
        List<Taxi> freeTaxis=new ArrayList<>();
        for(Taxi t:taxis){
            if(freeTime<=pickUpTime&&(Math.abs((currentSpot)-'0')-(pickUpPoint-'0'))<=pickUpTime-freeTime){
                  freeTaxis.add(t);
            }
        }
        for(int i=0;i<freeTaxis.size();i++){
            System.out.println("*"+freeTaxis.get(i));
        }
        return freeTaxis;
    }
}
