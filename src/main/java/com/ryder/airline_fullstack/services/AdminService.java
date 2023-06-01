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

    public void addFlightToAdmin(Long adminId, Long flightId) {
        Admin admin = adminRepository.findById(adminId).orElseThrow(() -> new EntityNotFoundException("Admin not found with id: " + adminId));
        Flight flight = flightRepository.findById(flightId).orElseThrow(() -> new EntityNotFoundException("Flight not found with id: " + flightId));

        admin.getFlights().add(flight);
        flight.getAdmins().add(admin);

        adminRepository.save(admin);
        flightRepository.save(flight);
    }

    public void removeFlightFromAdmin(Long adminId, Long flightId) {
        Admin admin = adminRepository.findById(adminId).orElseThrow(() -> new EntityNotFoundException("Admin not found with id: " + adminId));
        Flight flight = flightRepository.findById(flightId).orElseThrow(() -> new EntityNotFoundException("Flight not found with id: " + flightId));

        admin.getFlights().remove(flight);
        flight.getAdmins().remove(admin);

        adminRepository.save(admin);
        flightRepository.save(flight);
    }


}

//since the admin an only update their account, this is all that is required in this service

