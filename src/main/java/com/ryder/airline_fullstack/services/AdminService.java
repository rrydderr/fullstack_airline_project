package com.ryder.airline_fullstack.services;

import com.ryder.airline_fullstack.models.Admin;
import com.ryder.airline_fullstack.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

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

}

//since the admin an only update their account, this is all that is required in this service

