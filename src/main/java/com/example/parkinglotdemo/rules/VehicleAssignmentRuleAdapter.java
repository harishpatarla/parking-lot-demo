package com.example.parkinglotdemo.rules;

import com.example.parkinglotdemo.domain.ParkingFloor;
import com.example.parkinglotdemo.domain.ParkingSpot;
import com.example.parkinglotdemo.domain.Vehicle;
import com.example.parkinglotdemo.exceptions.SpotNotAvailableException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class VehicleAssignmentRuleAdapter implements VehicleAssignmentRule {

   private final ParkingFloor parkingFloor;

   @Override
   public ParkingSpot findAvailableSpot(Vehicle vehicle) throws SpotNotAvailableException {
      // get available spot according to vehicle type

   }
}
