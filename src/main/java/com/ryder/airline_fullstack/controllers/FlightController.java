package com.ryder.airline_fullstack.controllers;

import com.ryder.airline_fullstack.models.Flight;
import com.ryder.airline_fullstack.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
@Autowired
    private FlightService flightService;

    //get all flights
    @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights(){
        List<Flight>flights = flightService.getAllFlights();
        return new ResponseEntity<>(flights, HttpStatus.OK);
    }

    //get flights by id
    @GetMapping("/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable long id){
        Flight flight = flightService.getFlightById(id);
        if (flight == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(flight, HttpStatus.OK);
    }

    //add flight
    @PostMapping
    public ResponseEntity<Flight> addFlight(@RequestBody Flight flight){
        flightService.addFlight(flight);
        return new ResponseEntity<>(flight, HttpStatus.OK);
    }

    //update flight
    @PutMapping(value = "/{id}")
    public ResponseEntity<Flight> updateFlight(@PathVariable long id, @RequestBody Flight flight){
        flight.setId(id);
        Flight updatedFlight = flightService.updateFlight(flight);
        if (updatedFlight == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedFlight, HttpStatus.OK);
    }

    //delete flight
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Flight> deleteFlight(@PathVariable long id){
        flightService.deleteFlight(id);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
