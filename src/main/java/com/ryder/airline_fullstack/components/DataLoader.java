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
        Flight flight15 = new Flight("British Jets", LocalDate.of(2023, 6, 29), LocalTime.of(23, 27), 93.70, 138, "Trysil, Norway", 11, 200, FlightStatus.UNKNOWN);

        //Package Holidays
        PackageHoliday packageHoliday1 = new PackageHoliday("Cultural Climb", PackageHolidayType.CITY_BREAK, 879.51, "Rome, Italy", "Embark on a timeless adventure in Rome! Immerse yourself in its ancient wonders like the Colosseum and Vatican City. Explore the charming streets of Trastevere, make a wish at Trevi Fountain, and savor mouthwatering Italian cuisine. With its rich history and captivating beauty, Rome promises an unforgettable journey. Book now and experience the eternal allure of th", 5, AccommodationType.Hotel, flight14);
        PackageHoliday packageHoliday2 = new PackageHoliday("City Break", PackageHolidayType.CITY_BREAK, 1597.29, "Toronto, Canada", "Embark on an unforgettable journey to Toronto! Immerse yourself in its vibrant culture, iconic landmarks like the CN Tower, and diverse culinary scene. Explore the charming Distillery District, relax at Toronto Islands, and indulge in world-class shopping. Discover the perfect blend of cosmopolitan charm and natural beauty in this captivating city. Book now and create lasting memories! ", 7, AccommodationType.Apartment, flight14);
        PackageHoliday packageHoliday3 = new PackageHoliday("Countryside Escape", PackageHolidayType.COUNTRYSIDE, 1874.83, "British Colombia, Canada", "Embark on a breathtaking adventure in British Columbia! Immerse yourself in the stunning natural landscapes of Whistler, explore the charming streets of Victoria, and witness the awe-inspiring beauty of the Rocky Mountains. Discover the vibrant city life of Vancouver, indulge in outdoor activities like hiking and kayaking, and encounter diverse wildlife. With its awe-inspiring scenery and endless opportunities for adventure, British Columbia is a destination like no other. Book now and experience the magic of this Canadian gem!", 5, AccommodationType.Hotel, flight14);
        PackageHoliday packageHoliday4 = new PackageHoliday("'Tis The Ski-son'", PackageHolidayType.SKI, 2099.72, "Geneva, Switzerland", "Embark on an exhilarating ski trip to the breathtaking Alps! Immerse yourself in a winter wonderland of towering snow-capped peaks, pristine slopes, and charming alpine villages. Feel the adrenaline rush as you carve through powdery trails, surrounded by panoramic vistas. Whether you're a novice or an expert skier, the Alps offer a variety of slopes catering to all levels. Indulge in après-ski delights, savoring hearty mountain cuisine and warming up by crackling fires. Unforgettable memories await as you embrace the thrill of the slopes and the beauty of one of Europe's most iconic mountain ranges.", 5, AccommodationType.Hotel, flight14);
        PackageHoliday packageHoliday5 = new PackageHoliday("Under The Stars", PackageHolidayType.CAMPING, 650.94, "Brussels, Belgium", "Embark on a memorable camping adventure in the heart of Brussels! Escape the bustling city and discover the natural beauty that surrounds this vibrant metropolis. Set up your tent in a picturesque campsite, nestled amidst lush greenery and serene surroundings. Wake up to the sound of birdsong and enjoy a refreshing morning hike in nearby forests or parks. Explore Brussels' rich cultural heritage by visiting iconic landmarks like the Grand Place, Atomium, and Manneken Pis. Indulge in delectable Belgian cuisine, sampling famous chocolates, waffles, and local brews. End your days with cozy campfires, sharing stories and creating lasting memories under starry skies. A camping trip in Brussels promises a perfect blend of nature, culture, and adventure.", 5, AccommodationType.Hotel, flight14);
        PackageHoliday packageHoliday6 = new PackageHoliday("Concrete Jungle", PackageHolidayType.CITY_BREAK, 794.23, "Barcelona, Spain", "Experience the vibrant charm of Barcelona on an unforgettable city break! Immerse yourself in the architectural wonders of Gaudi, stroll along the lively Las Ramblas, and soak up the sun on the beautiful beaches. Indulge in delectable tapas, explore the Gothic Quarter, and marvel at the iconic Sagrada Familia. With its rich history, captivating art scene, and energetic atmosphere, Barcelona offers the perfect blend of culture, cuisine, and coastal beauty. Get ready for an enchanting adventure in this cosmopolitan gem of Catalonia!", 5, AccommodationType.Hotel, flight14);
        PackageHoliday packageHoliday7 = new PackageHoliday("Cruising 'round", PackageHolidayType.CRUISE, 1507.75, "Malé, Maldives", "Embark on a dreamy cruise around the Maldives! Sail across crystal-clear turquoise waters, discovering secluded islands and pristine coral reefs. Dive into a world of vibrant marine life, relax on white sandy beaches, and indulge in luxury amenities onboard. Experience breathtaking sunsets, snorkel in colorful lagoons, and pamper yourself with rejuvenating spa treatments. With its picture-perfect scenery and warm hospitality, a cruise in the Maldives promises an idyllic escape in paradise.", 5, AccommodationType.Hotel, flight14);
        PackageHoliday packageHoliday8 = new PackageHoliday("Yurt It Up", PackageHolidayType.CAMPING, 849.64, "Marrakech, Morocco", "Embark on an enchanting camping trip in Marrakech! Immerse yourself in the vibrant colors, exotic scents, and rich culture of this Moroccan gem. Set up camp in the serene outskirts, surrounded by desert landscapes and majestic Atlas Mountains. Explore Marrakech's bustling souks, visit the iconic Jardin Majorelle, and indulge in mouthwatering Moroccan cuisine. As the sun sets, gather around a crackling campfire, be captivated by traditional music and dance performances, and sleep under a blanket of stars. A camping trip in Marrakech offers a unique blend of adventure, cultural immersion, and natural beauty.", 5, AccommodationType.Hotel, flight14);
        PackageHoliday packageHoliday9 = new PackageHoliday("Udderly Great!", PackageHolidayType.COUNTRYSIDE, 386.17, "Edinburgh, Scotland", "Escape to the serene countryside surrounding Edinburgh for a peaceful farm retreat. Immerse yourself in the rustic charm of working farms, where you can reconnect with nature and experience the joys of rural life. Enjoy hands-on activities like feeding animals, milking cows, and gathering fresh eggs. Take leisurely walks through picturesque fields, breathing in the crisp country air. Indulge in farm-to-table meals, savoring locally sourced produce and homemade delicacies. Unwind in cozy farm cottages, surrounded by rolling hills and idyllic landscapes. A farm escape to Edinburgh offers a unique opportunity to rejuvenate, recharge, and immerse yourself in the tranquility of the countryside.", 5, AccommodationType.Hotel, flight14);
        PackageHoliday packageHoliday10 = new PackageHoliday("Ski You Later!", PackageHolidayType.SKI, 2037.81, "Trysil, Norway", "Embark on an exhilarating ski trip to Trysil! Nestled in the stunning Norwegian countryside, Trysil offers a winter paradise for skiers of all levels. Hit the slopes on perfectly groomed trails, surrounded by breathtaking alpine scenery. Experience the thrill of carving through fresh powder and challenging yourself on varied terrain. After an adventurous day on the slopes, unwind in cozy mountain lodges, savoring traditional Norwegian cuisine and warming up by crackling fires. With its well-developed ski infrastructure and charming village atmosphere, Trysil guarantees an unforgettable ski adventure for all snow enthusiasts.", 5, AccommodationType.Hotel, flight14);


        //save all admins:
        adminRepository.saveAll(
                Arrays.asList(admin1, admin2, admin3, admin4, admin5
                ));

        //save as customers:
        customerRepository.saveAll(Arrays.asList(
                customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8, customer9
        ));

        //save all flights
        flightRepository.saveAll(Arrays.asList(
                flight1, flight2, flight3, flight4, flight5, flight6, flight7, flight8, flight9, flight10, flight11, flight12, flight13, flight14, flight15
        ));

        //save all package holidays
        packageHolidayRepository.saveAll(Arrays.asList(
                packageHoliday1, packageHoliday2, packageHoliday3, packageHoliday4, packageHoliday5, packageHoliday6, packageHoliday7, packageHoliday8, packageHoliday9, packageHoliday10
        ));


    }
}
