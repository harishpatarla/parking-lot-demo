package com.example.parkinglotdemo.exceptions;

public class SpotNotAvailableException extends RuntimeException {
   public SpotNotAvailableException(String message) {
      super(message);
   }
}
