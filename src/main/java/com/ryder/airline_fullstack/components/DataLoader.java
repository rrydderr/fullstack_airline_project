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
import java.util.Arrays;

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
        Flight flight1 = new Flight("Lightning McSpeed", LocalDate.of(2023, 6, 7), LocalTime.of(12, 30), 299.99, 480, "Toronto, Canada", 78, 250, FlightStatus.UNKNOWN);
        Flight flight2 = new Flight("Lightning McSpeed", LocalDate.of(2023, 5, 31), LocalTime.of(16, 30), 189.99, 63, "Barcelona, Spain", 11, 150, FlightStatus.UNKNOWN);
        Flight flight3 = new Flight("Lightning McSpeed", LocalDate.of(2023, 5, 21), LocalTime.of(17, 45), 229.99, 190, "Antalya, Turkey", 5, 150, FlightStatus.CANCELLED);
        Flight flight4 = new Flight("Lightning McSpeed", LocalDate.of(2023, 5, 22), LocalTime.of(4, 5), 99.99, 30, "Edinburgh, Scotland", 7, 100, FlightStatus.ARRIVED);
        Flight flight5 = new Flight("Lightning McSpeed", LocalDate.of(2023, 6, 1), LocalTime.of(20, 0), 490.99, 102, "Geneva, Switzerland", 100, 250, FlightStatus.UNKNOWN);
        Flight flight6 = new Flight("Global Air", LocalDate.of(2023, 5, 22), LocalTime.of(14, 30), 670.00, 480, "Toronto, Canada", 65, 300, FlightStatus.ON_TIME);
        Flight flight7 = new Flight("Global Air", LocalDate.of(2023, 5, 30), LocalTime.of(6, 25), 990.00, 630, "Malé, Maldives", 43, 300, FlightStatus.UNKNOWN);
        Flight flight8 = new Flight("Global Air", LocalDate.of(2023, 5, 22), LocalTime.of(4, 57), 389.99, 210, "Marrakech, Morocco", 2, 300, FlightStatus.DEPARTED);
        Flight flight9 = new Flight("Global Air", LocalDate.of(2023, 5, 22), LocalTime.of(22, 15), 1050.00, 586, "British Colombia, Canada", 0, 250, FlightStatus.PLEASE_WAIT);
        Flight flight10 = new Flight("Global Air", LocalDate.of(2023, 6, 2), LocalTime.of(2, 58), 77.87, 145, "Milan, Italy", 73, 250, FlightStatus.UNKNOWN);
        Flight flight11 = new Flight("British Jets", LocalDate.of(2023, 5, 22), LocalTime.of(23, 5), 104.72, 147, "Milan, Italy", 23, 250, FlightStatus.DELAYED);
        Flight flight12 = new Flight("British Jets", LocalDate.of(2023, 5, 24), LocalTime.of(15, 49), 198.49, 169, "Madrid, Spain", 0, 250, FlightStatus.CANCELLED);
        Flight flight13 = new Flight("British Jets", LocalDate.of(2023, 5, 22), LocalTime.of(1, 37), 204.55, 172, "Brussels, Belgium", 0, 200, FlightStatus.BOARDING);
        Flight flight14 = new Flight("British Jets", LocalDate.of(2023, 6, 30), LocalTime.of(0, 8), 202.82, 153, "Rome, Italy", 8, 200, FlightStatus.UNKNOWN);
        Flight flight15 = new Flight("British Jets", LocalDate.of(2023, 6, 29), LocalTime.of(23, 27), 93.70, 138, "Marseille, France", 11, 200, FlightStatus.UNKNOWN);

        //Package Holidays
//    PackageHoliday packageHoliday = new PackageHoliday("Cultural Climb", 200.00, "Rome, Italy", "The heart of Cultural Exploration... ", 5, AccommodationType.Hotel, flight14);


        //save all admins:
        adminRepository.saveAll(Arrays.asList(
                admin1, admin2, admin3, admin4, admin5
        ));

        //save as customers:
        customerRepository.saveAll(Arrays.asList(
                customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8, customer9
        ));

        //save all flights"
        flightRepository.saveAll(Arrays.asList(
                flight1, flight2, flight3, flight4, flight5, flight6, flight7, flight8, flight9, flight10, flight11, flight12, flight13, flight14, flight15
        ));





    }
}
