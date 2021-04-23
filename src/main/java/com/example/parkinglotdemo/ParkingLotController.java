package com.example.parkinglotdemo;

import com.example.parkinglotdemo.events.VehicleEntryEvent;
import com.example.parkinglotdemo.exceptions.IllegitimateVehicleException;
import com.example.parkinglotdemo.exceptions.SpotNotAvailableException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ParkingLotController {

   private final ApplicationEventPublisher applicationEventPublisher;

   public void enter(VehicleEntryEvent vehicleEntryEvent)
      throws SpotNotAvailableException, IllegitimateVehicleException {
      applicationEventPublisher.publishEvent(vehicleEntryEvent);
   }
}
