package com.ryder.airline_fullstack.controllers;

import com.ryder.airline_fullstack.models.Admin;
import com.ryder.airline_fullstack.models.Flight;
import com.ryder.airline_fullstack.services.AdminService;
import com.ryder.airline_fullstack.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @Autowired
    private FlightService flightService;

    //get all admins
    @GetMapping
    public ResponseEntity<List<Admin>> getAllAdmins(){
        List<Admin> admins = adminService.getallAdmin();
        return new ResponseEntity<>(admins, HttpStatus.OK);
    }

    // get admin by id
    @GetMapping("/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable long id) {
        Admin admin = adminService.getAdminById(id);
        if (admin == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }

    //update admin
    @PutMapping(value = "/{id}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable long id, @RequestBody Admin admin){
        admin.setId(id);
        Admin updatedAdmin = adminService.updateAdmin(admin);
        if (updatedAdmin== null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
    }

    // Create a new flight for an admin
    @PostMapping("/{adminId}/flights")
    public ResponseEntity<Flight> createFlight(@PathVariable long adminId, @RequestBody Flight flight) {
        Admin admin = adminService.getAdminById(adminId);
        if (admin == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        flight.setAdmin(admin);
        Flight createdFlight = flightService.addFlight(flight);
        return new ResponseEntity<>(createdFlight, HttpStatus.CREATED);
    }


    // Update a flight by ID for an admin
    @PutMapping("/{adminId}/flights/{flightId}")
    public ResponseEntity<Flight> updateFlight(@PathVariable long adminId, @PathVariable long flightId, @RequestBody Flight flight) {
        Admin admin = adminService.getAdminById(adminId);
        if (admin == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        flight.setAdmin(admin);
        Flight updatedFlight = flightService.updateFlight(flight);
        if (updatedFlight == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedFlight, HttpStatus.OK);
    }

    // Delete a flight by ID for an admin
    @DeleteMapping("/{adminId}/flights/{flightId}")
    public ResponseEntity<?> deleteFlight(@PathVariable long adminId, @PathVariable long flightId) {
        Admin admin = adminService.getAdminById(adminId);
        if (admin == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            flightService.deleteFlight(flightId);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
