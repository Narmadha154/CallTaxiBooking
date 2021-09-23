package com.company.booking;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
    static int taxiCount=0;
    static int taxiId;
    private  boolean currentStatus;
    private char currentSpot;
    private int freeTime;
    private double totalEarnings;
    private List<String> trip=new ArrayList<>();
    public Taxi(){
        currentStatus=false;
        taxiCount=taxiCount+1;
        taxiId=taxiCount;
    }
    public  boolean isCurrentStatus() {
        return currentStatus;
    }
    public void setCurrentStatus(boolean currentStatus) {
        this.currentStatus = currentStatus;
    }
    public int getFreeTime() {
        return freeTime;
    }
    public  void setFreeTime(int freeTime) {
        this.freeTime =freeTime;
    }
    public double getTotalEarnings() {
        return totalEarnings;
    }
    public void setTotalEarnings(double totalEarnings) {
        this.totalEarnings = totalEarnings;
    }
    public List<String> getTrip() {
        return trip;
    }
    public  void setTrip(String tripDetail) {
        trip.add(tripDetail);
    }
    public char getCurrentSpot() {
        return currentSpot;
    }
    public void setCurrentSpot(char currentSpot) {
        this.currentSpot = currentSpot;
    }
    public  int getTaxiCount() {
        return taxiCount;
    }
    public int getTaxiId() {
        return taxiId;
    }
    public void setTaxiCount(int taxiCount) {
        this.taxiCount = taxiCount;
    }
    public void setTaxiId(int taxiId) {
        this.taxiId = taxiId;
    }



}
