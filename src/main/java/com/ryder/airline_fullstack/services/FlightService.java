package com.ryder.airline_fullstack.services;

import com.ryder.airline_fullstack.models.Admin;
import com.ryder.airline_fullstack.models.Flight;
import com.ryder.airline_fullstack.repositories.AdminRepository;
import com.ryder.airline_fullstack.repositories.FlightRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    AdminRepository adminRepository;

    //find all flights
    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    //find flight by id
    public Flight getFlightById(long id){
        Optional<Flight> flight = flightRepository.findById(id);
        return flight.orElse(null);
    }

    //add flight
    public Flight addFlight(Flight flight){
        return flightRepository.save(flight);
    }

    //update flight
    public Flight updateFlight (Flight flight){
        Optional<Flight> existingFlight = flightRepository.findById(flight.getId());
        if (existingFlight.isPresent()){
            return flightRepository.save(flight);
        } else {
            return null;
        }
    }

    //delete flight
    public void deleteFlight(long id){
        flightRepository.deleteById(id);
    }

    public void addAdminToFlight(Long flightId, Long adminId) {
        Flight flight = flightRepository.findById(flightId).orElseThrow(() -> new EntityNotFoundException("Flight not found with id: " + flightId));
        Admin admin = adminRepository.findById(adminId).orElseThrow(() -> new EntityNotFoundException("Admin not found with id: " + adminId));

        flight.getAdmins().add(admin);
        admin.getFlights().add(flight);

        flightRepository.save(flight);
        adminRepository.save(admin);
    }

    public void removeAdminFromFlight(Long flightId, Long adminId) {
        Flight flight = flightRepository.findById(flightId).orElseThrow(() -> new EntityNotFoundException("Flight not found with id: " + flightId));
        Admin admin = adminRepository.findById(adminId).orElseThrow(() -> new EntityNotFoundException("Admin not found with id: " + adminId));

        flight.getAdmins().remove(admin);
        admin.getFlights().remove(flight);

        flightRepository.save(flight);
        adminRepository.save(admin);
    }
}
