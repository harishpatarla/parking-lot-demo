package com.example.parkinglotdemo.domain;

import lombok.Builder;
import lombok.Value;

import java.util.Date;

@Value
@Builder
public class Vehicle {
   private String plate;
   private double height;
   private VehicleType type;

   public static final Double MAX_HEIGHT = 1000.0;

   public Boolean isVehicleTypeAllowed(Double vehicleHeight) {
      return vehicleHeight < MAX_HEIGHT;
   }

   public void park(ParkingSpot parkingSpot) {
      this.parkingSpot = parkingSpot;
      this.enterTime = new Date();
   }

   public void leave() {
      this.parkingSpot = null;
      this.leaveTime = new Date();
   }}
