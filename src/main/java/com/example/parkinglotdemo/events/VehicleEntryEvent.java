package com.example.parkinglotdemo.events;

import com.example.parkinglotdemo.domain.Vehicle;
import com.example.parkinglotdemo.domain.VehicleType;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Value
@Builder
public class VehicleEntryEvent {
   private Vehicle vehicle;
   private LocalDateTime entryTime;

   public Boolean isOpenForEntry(LocalTime localTime) {
      LocalTime openTime = LocalTime.of (8, 0);
      LocalTime closeTime = LocalTime.of (22, 0);
      return localTime.isBefore(openTime) && localTime.isAfter(closeTime);
   }

}
