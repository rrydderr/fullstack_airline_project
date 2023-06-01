package com.ryder.airline_fullstack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long id;

    @Column
    private String airline;

    @Column
    private LocalDate dateOfFlight;

    @Column
    private LocalTime timeOfFlight;

    @Column
    private Double price;

    @Column
    private int flightDuration;

    @Column
    private String destination;

    @Column
    private int availableSeats;

    @Column
    private int totalSeats;

    @Enumerated
    private FlightStatus flightStatus;

    @ManyToMany(mappedBy = "flights")
    private List<Customer> customers;

    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = false)
    @JsonIgnoreProperties("flights")
    private Admin admin;

    @OneToMany(mappedBy = "flights", orphanRemoval = true)
    @JsonIgnoreProperties("flights")
    private List<PackageHoliday> packageHolidays;

    public Flight() {
    }

    public Flight(String airline, LocalDate dateOfFlight, LocalTime timeOfFlight, Double price, int flightDuration, String destination, int availableSeats, int totalSeats, FlightStatus flightStatus, Admin admin) {
        this.airline = airline;
        this.dateOfFlight = dateOfFlight;
        this.timeOfFlight = timeOfFlight;
        this.price = price;
        this.flightDuration = flightDuration;
        this.destination = destination;
        this.availableSeats = availableSeats;
        this.totalSeats = totalSeats;
        this.flightStatus = flightStatus;
        this.admin = admin;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public LocalDate getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(LocalDate dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public LocalTime getTimeOfFlight() {
        return timeOfFlight;
    }

    public void setTimeOfFlight(LocalTime timeOfFlight) {
        this.timeOfFlight = timeOfFlight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public FlightStatus getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(FlightStatus flightStatus) {
        this.flightStatus = flightStatus;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }


    public List<PackageHoliday> getPackageHoliday() {
        return packageHolidays;
    }

    public void setPackageHoliday(List<PackageHoliday> packageHoliday) {
        this.packageHolidays = packageHoliday;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

}
