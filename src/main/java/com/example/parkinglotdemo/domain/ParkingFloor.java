package com.example.parkinglotdemo.domain;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class ParkingFloor {
   private Integer floorNumber;
   private List<ParkingSpot> parkingSpots;
   private static final Integer FLOOR_CAPACITY = 16;
}
