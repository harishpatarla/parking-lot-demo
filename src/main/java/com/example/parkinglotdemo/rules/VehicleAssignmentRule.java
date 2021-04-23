package com.example.parkinglotdemo.rules;

import com.example.parkinglotdemo.domain.ParkingSpot;
import com.example.parkinglotdemo.domain.Vehicle;
import com.example.parkinglotdemo.exceptions.SpotNotAvailableException;

public interface VehicleAssignmentRule {

   ParkingSpot findAvailableSpot(Vehicle vehicle) throws SpotNotAvailableException;
}
