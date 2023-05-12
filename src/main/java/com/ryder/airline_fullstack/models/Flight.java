package com.ryder.airline_fullstack.models;

import jakarta.persistence.*;

import java.util.ArrayList;

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


    //need to include enum

    //need to include the many to many relationship with customers


    public Flight() {
    }

    public Flight(Long id, String airline, Double price, int flightDuration, String destination, int availableSeats, int totalSeats, FlightStatus flightStatus) {
        this.id = id;
        this.airline = airline;
        this.price = price;
        this.flightDuration = flightDuration;
        this.destination = destination;
        this.availableSeats = availableSeats;
        this.totalSeats = totalSeats;
        this.flightStatus = flightStatus;
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
}
