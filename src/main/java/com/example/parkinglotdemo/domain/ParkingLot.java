package com.example.parkinglotdemo.domain;

import com.example.parkinglotdemo.events.VehicleEntryEvent;

import java.util.List;

public class ParkingLot {
   private String name;
   private List<ParkingFloor> parkingFloors;


   public static final int PARKING_FLOORS_CAPACITY = 10;

   public Boolean isOpen() {
      return true;
   }

   public boolean isFull() {
      return false;
   }
}
