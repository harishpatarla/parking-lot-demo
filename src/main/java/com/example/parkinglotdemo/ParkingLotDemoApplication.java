package com.example.parkinglotdemo;

import com.example.parkinglotdemo.domain.ParkingLotDomainConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ParkingLotDomainConfiguration.class})
public class ParkingLotDemoApplication {

   public static void main(String[] args) {
      SpringApplication.run(ParkingLotDemoApplication.class, args);

   }

}
