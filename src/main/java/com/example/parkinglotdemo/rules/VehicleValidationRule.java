package com.example.parkinglotdemo.rules;

import com.example.parkinglotdemo.events.VehicleEntryEvent;

public interface VehicleValidationRule {

   void validate(VehicleEntryEvent vehicleEntryEvent);
}
