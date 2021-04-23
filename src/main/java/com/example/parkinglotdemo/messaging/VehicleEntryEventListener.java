package com.example.parkinglotdemo.messaging;

import com.example.parkinglotdemo.domain.ParkingSpot;
import com.example.parkinglotdemo.events.VehicleEntryEvent;
import com.example.parkinglotdemo.exceptions.IllegitimateVehicleException;
import com.example.parkinglotdemo.exceptions.ParkingLotClosedException;
import com.example.parkinglotdemo.exceptions.SpotNotAvailableException;
import com.example.parkinglotdemo.rules.VehicleAssignmentRule;
import com.example.parkinglotdemo.rules.VehicleValidationRule;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Component
@RequiredArgsConstructor
public class VehicleEntryEventListener {

   private final VehicleValidationRule vehicleValidationRule;
   private final VehicleAssignmentRule vehicleAssignmentRule;

   @Transactional
   @EventListener
   public void onDomainEvent(final VehicleEntryEvent vehicleEntryEvent) throws IllegitimateVehicleException, SpotNotAvailableException,
      ParkingLotClosedException {
      try {
         // check validations and throw relevant exceptions
         // if height does not match any available then throw IllegitimateVehicleException
         vehicleValidationRule.validate(vehicleEntryEvent);
         // if  not match any available then throw SpotNotAvailableException
         ParkingSpot parkingSpot = vehicleAssignmentRule.findAvailableSpot(vehicleEntryEvent.getVehicle());

         //update available spots
         //createTicket
      } catch (RuntimeException e) {
         //error level or throw business exceptions
      }
   }
}
