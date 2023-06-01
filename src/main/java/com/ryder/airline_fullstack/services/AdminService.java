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
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private FlightRepository flightRepository;


    //get all admin = return a list of all admin
    public List<Admin> getallAdmin() {
        return adminRepository.findAll();
    }


    // get admin by id
    public Admin getAdminById(long id) {
        Optional<Admin> admin = adminRepository.findById(id);
        return admin.orElse(null);
    }
//    this retrieves an admin object from the admin repository based on the provided id
//    it returns an optional object, which can either contain the admin object if found or be empty if no
//    admin object exists with the given id.
//    ((returns admin object or null if no object is found))


    //update admin (by id)
    public Admin updateAdmin(Admin admin) {
        Optional<Admin> existingAdmin = adminRepository.findById(admin.getId());
        if (existingAdmin.isPresent()) {
            return adminRepository.save(admin);
        } else {
            return null;
        }
    }
    //this retrieves an admin object based on id - if the object exists then it will call the save method
    //(taken from admin repository), otherwise it will return null if no object is found

    //Admin can add a new flight
    public String createFlight(Admin admin, Flight flight){
        flight.setAdmin(admin);
        flightRepository.save(flight);
        return "You have successfully created flight" + flight.getId() + ".";
    }

    //Admin can update an existing flight
    public String updateExistingFlightById(Long flightId, Flight updatedFlight) {
        Flight flight = flightRepository.findById(flightId).orElse(null);
        if (flight != null){
            flight.setAirline(updatedFlight.getAirline());
            flight.setAdmin(updatedFlight.getAdmin());
            flight.setDateOfFlight(updatedFlight.getDateOfFlight());
            flight.setFlightDuration(updatedFlight.getFlightDuration());
            flight.setAvailableSeats(updatedFlight.getAvailableSeats());
            flight.setTimeOfFlight(updatedFlight.getTimeOfFlight());
            flight.setDestination(updatedFlight.getDestination());
            flight.setPackageHoliday(updatedFlight.getPackageHoliday());
            flight.setTotalSeats(updatedFlight.getTotalSeats());
            flight.setPrice(updatedFlight.getPrice());
            flight.setFlightStatus(updatedFlight.getFlightStatus());

            flightRepository.save(flight);
        }
        return "You have successfully updated flight" + updatedFlight.getId() + ".";
    }


    //Admin can delete a flight by id
    public void deleteExistingFlightById(Long flightId){
        flightRepository.deleteById(flightId);
    }




}

//since the admin an only update their account and add, update and remove flights this is all that is required in this service

