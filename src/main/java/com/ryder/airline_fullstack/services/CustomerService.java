package com.ryder.airline_fullstack.services;

import com.ryder.airline_fullstack.models.Customer;
import com.ryder.airline_fullstack.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    //get all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    //get customer by id
    public Customer getCustomerById(long id){
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.orElse(null);
    }

    //add customer
    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    //update customer
    public Customer updateCustomer (Customer customer){
        Optional<Customer> existingCustomer = customerRepository.findById(customer.getId());
        if (existingCustomer.isPresent()){
            return customerRepository.save(customer);
        } else{
            return null;
        }
    }

    //delete customer
    public void deleteCustomer(long id) {
        customerRepository.deleteById(id);
    }

}
