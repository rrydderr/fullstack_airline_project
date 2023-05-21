package com.ryder.airline_fullstack.components;

import com.ryder.airline_fullstack.models.*;
import com.ryder.airline_fullstack.repositories.AdminRepository;
import com.ryder.airline_fullstack.repositories.CustomerRepository;
import com.ryder.airline_fullstack.repositories.FlightRepository;
import com.ryder.airline_fullstack.repositories.PackageHolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

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
    Customer customer2 = new Customer("SpongeBob Squarepants", "spongebobsquarepants@gmail.com", "KrabbyPattiesRule", "2566361", LocalDate.of(1986, 7, 14), "555-555-5555", "124 Conch Street, Bikini Bottom");
    Customer customer3 = new Customer("Patrick Star", "patstar@gmail.com", "jellyfishing77", "4534568", LocalDate.of(1989, 11, 11), "555-555-5556", "120 Conch Street, Bikini Bottom");
    Customer customer4 = new Customer("Sandra Jennifer Cheeks", "cheekssandy@gmail.com", "BushyTail", "8047367", LocalDate.of(1988, 11, 17), "557-786-9932", "Sandy's TreeDome, Bikini Bottom");
    Customer customer5 = new Customer("Eugene Harold Krabs", "mrkrabs@gmail.com", "Moneymoneymoney", "1224364", LocalDate.of(1942, 11, 30), "334-441-8088", "3451 Anchor Way, Bikini Bottom");
    Customer customer6 = new Customer("Squidward Quincy Tentacles", "squidqtentacles@gmail.com", "clarinetKing28", "6703645", LocalDate.of(1985, 10, 9), "07891412226", "122 Conch Street, Bikini Bottom");
    Customer customer9 = new Customer("Gary Wilson Jr", "meow@gmail.com", "meowmeow", "2785475", LocalDate.of(1989, 11, 27), "555-555-5555", "124 Conch Street, Bikini Bottom");
    Customer customer7 = new Customer("Pearl Krabs", "pearlykrabs@gmail.com", "notawhale", "4295746", LocalDate.of(1990, 5, 12), "655-672-3307", "3451 Anchor Way, Bikini Bottom");
    Customer customer8 = new Customer("Penelope Puff", "penelopepuff@gmail.com", "puffboatingschool123", "8767548", LocalDate.of(1958, 1, 12), "335-623-9055", "Mrs.Puffs House, Bikini Bottom");

    //Flights

//    Flight flight = new Flight("Ryzair", LocalDate.of(2023, 6, 7), LocalTime.of(12, 30), 198.99, 190, "British Colombia, Canada", 23, 250, FlightStatus.UNKNOWN,);



}
