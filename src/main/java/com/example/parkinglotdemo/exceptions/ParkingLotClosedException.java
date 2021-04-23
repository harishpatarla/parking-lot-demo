package com.example.parkinglotdemo.exceptions;

public class ParkingLotClosedException extends RuntimeException {
   public ParkingLotClosedException(String message) {
      super(message);
   }
}
