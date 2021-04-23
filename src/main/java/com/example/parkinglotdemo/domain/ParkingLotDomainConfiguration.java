package com.example.parkinglotdemo.domain;

import com.example.parkinglotdemo.ParkingLotController;
import com.example.parkinglotdemo.events.VehicleEntryEvent;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ParkingLotDomainConfiguration {

   @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
   public ParkingLot getParkingLot() {
      return new ParkingLot();
   }
}
