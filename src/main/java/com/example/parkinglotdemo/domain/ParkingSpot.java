package com.example.parkinglotdemo.domain;

import java.util.Set;

public class ParkingSpot {
   private int level;
   private int height;
   private int spotNo;
   private boolean vacant;
   private Vehicle vehicle;
   private Set<VehicleType> suitableFor;


   public boolean isAvailable() {
      return vehicle == null;
   }

}
