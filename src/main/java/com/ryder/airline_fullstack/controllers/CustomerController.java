package com.ryder.airline_fullstack.controllers;

import com.ryder.airline_fullstack.models.Customer;
import com.ryder.airline_fullstack.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    //Get all customers
    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> customers = customerService.getAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    //get customer by id
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable long id){
        Customer customer = customerService.getCustomerById(id);
        if (customer == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    //add customer
    @PostMapping
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    //update customer
    @PutMapping(value = "/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable long id, @RequestBody Customer customer){
        Customer updatedCustomer = customerService.updateCustomer(customer);
        if (updatedCustomer == null){
            return new ResponseEntity<Customer>(HttpStatus.OK);
        }
        return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
    }

    //delete customer
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable long id){
        customerService.deleteCustomer(id);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
