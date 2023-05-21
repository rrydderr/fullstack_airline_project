package com.ryder.airline_fullstack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "package_holidays")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "package_type")
public class PackageHoliday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long id;

    @Column
    private String packageName;

    @Column
    private Double price;

    @Column
    private String destination;

    @Column
    private String description;

    @Column
    private int duration;

    @Enumerated
    private AccommodationType accommodationType;

    @Enumerated(EnumType.STRING)
    private PackageHolidayType packageHolidayType;

    @ManyToOne
    @JoinColumn(name= "flight_id", nullable = false)
    @JsonIgnoreProperties("packageHolidays")
    private Flight flights;


    @ManyToMany (mappedBy = "packageHolidays")
    private List<Customer>customers;

    @ManyToMany (mappedBy = "packageHolidays")
    private List<Admin>admins;

    public PackageHoliday() {
    }

    public PackageHoliday(String packageName, Double price, String destination, String description, int duration, AccommodationType accommodationType, Flight fLights) {
        this.packageName = packageName;
        this.price = price;
        this.destination = destination;
        this.description = description;
        this.duration = duration;
        this.accommodationType = accommodationType;
        this.flights = fLights;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public AccommodationType getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(AccommodationType accommodationType) {
        this.accommodationType = accommodationType;
    }

    public PackageHolidayType getPackageHolidayType() {
        return packageHolidayType;
    }

    public void setPackageHolidayType(PackageHolidayType packageHolidayType) {
        this.packageHolidayType = packageHolidayType;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }

    public Flight getFlights() {
        return flights;
    }

    public void setFlights(Flight flights) {
        this.flights = flights;
    }
}

