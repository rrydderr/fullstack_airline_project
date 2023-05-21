package com.ryder.airline_fullstack.components;

import com.ryder.airline_fullstack.models.Admin;
import com.ryder.airline_fullstack.models.Customer;
import com.ryder.airline_fullstack.repositories.AdminRepository;
import com.ryder.airline_fullstack.repositories.CustomerRepository;
import com.ryder.airline_fullstack.repositories.FlightRepository;
import com.ryder.airline_fullstack.repositories.PackageHolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private PackageHolidayRepository packageHolidayRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
    }
    //ADMINS
    Admin admin1 = new Admin("Ryder Zane", "ryderzrashid@gmail.com", "Password", "12345");
    Admin admin2 = new Admin("Jane Doe", "JaneDoe@gmail.com", "HopScotch56", "54321");
    Admin admin3 = new Admin("Emily Elizabeth Dickinson", "EmilyEDickinson@gmail.com", "iwritePoems", "98765");
    Admin admin4 = new Admin("John Keats", "JohnKeats@gmail.com", "Moorgate", "31795");
    Admin admin5 = new Admin("Stella Nina McCartney", "StellaNMcCartney@gmail.com", "FashionCEO", "13971");


    //Customers
    Customer customer1 = new Customer("Ryder Zane", "ryderzrashid@gmail.com", "Password", "1098765", LocalDate.of(2001, 5, 1), "07891412226", "5 Buckingham Palace, London");
    Customer customer2 = new Customer("SpongeBob Squarepants", "ryderzrashid@gmail.com", "Password", "1098765", LocalDate.of(2001, 5, 1), "07891412226", "5 Buckingham Palace, London");
    Customer customer3 = new Customer("Patrick Star", "ryderzrashid@gmail.com", "Password", "1098765", LocalDate.of(2001, 5, 1), "07891412226", "5 Buckingham Palace, London");
    Customer customer4 = new Customer("Sandy Cheeks", "ryderzrashid@gmail.com", "Password", "1098765", LocalDate.of(2001, 5, 1), "07891412226", "5 Buckingham Palace, London");
    Customer customer5 = new Customer("Ryder Zane", "ryderzrashid@gmail.com", "Password", "1098765", LocalDate.of(2001, 5, 1), "07891412226", "5 Buckingham Palace, London");
    Customer customer6 = new Customer("Ryder Zane", "ryderzrashid@gmail.com", "Password", "1098765", LocalDate.of(2001, 5, 1), "07891412226", "5 Buckingham Palace, London");
    Customer customer7 = new Customer("Ryder Zane", "ryderzrashid@gmail.com", "Password", "1098765", LocalDate.of(2001, 5, 1), "07891412226", "5 Buckingham Palace, London");
    Customer customer8 = new Customer("Ryder Zane", "ryderzrashid@gmail.com", "Password", "1098765", LocalDate.of(2001, 5, 1), "07891412226", "5 Buckingham Palace, London");
    Customer customer9 = new Customer("Ryder Zane", "ryderzrashid@gmail.com", "Password", "1098765", LocalDate.of(2001, 5, 1), "07891412226", "5 Buckingham Palace, London");





}
