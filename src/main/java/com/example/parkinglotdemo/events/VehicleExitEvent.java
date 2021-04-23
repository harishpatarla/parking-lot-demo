package com.example.parkinglotdemo.events;

import com.example.parkinglotdemo.domain.Vehicle;
import lombok.Builder;
import lombok.Value;
import org.springframework.context.ApplicationEvent;

import java.time.LocalDateTime;

@Value
@Builder
public class VehicleExitEvent {
   private final Vehicle vehicle;
   private final LocalDateTime exitTime;

}
