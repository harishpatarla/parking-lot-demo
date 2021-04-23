package com.example.parkinglotdemo.rules;

import com.example.parkinglotdemo.domain.Vehicle;
import com.example.parkinglotdemo.events.VehicleEntryEvent;
import com.example.parkinglotdemo.exceptions.IllegitimateVehicleException;
import com.example.parkinglotdemo.exceptions.ParkingLotClosedException;
import com.example.parkinglotdemo.rules.VehicleValidationRule;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class VehicleValidationRuleAdapter implements VehicleValidationRule {

   @Override
   public void validate(VehicleEntryEvent vehicleEntryEvent) {
      Vehicle vehicle = vehicleEntryEvent.getVehicle();

      if (!vehicleEntryEvent.isOpenForEntry(vehicleEntryEvent.getEntryTime().toLocalTime())) {
         throw new ParkingLotClosedException("Its closed!");
      }
      if(vehicle.isVehicleTypeAllowed(vehicle.getHeight())) {
         throw new IllegitimateVehicleException("Vehicle Parking not supported");
      }

   }
}
