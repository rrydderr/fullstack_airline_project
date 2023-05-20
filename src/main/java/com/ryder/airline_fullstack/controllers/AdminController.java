package com.ryder.airline_fullstack.controllers;

import com.ryder.airline_fullstack.models.Admin;
import com.ryder.airline_fullstack.services.AdminService;
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
}
