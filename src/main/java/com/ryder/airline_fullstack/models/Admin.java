package com.ryder.airline_fullstack.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long id;

    @Column
    private String fullName;

    @Column
    private String emailAddress;

    @Column
    private String password;

    @Column
    private String adminPin;

    @ManyToMany
    @JoinTable(name="admins_flights",
    joinColumns = @JoinColumn(name="admin_id"),
    inverseJoinColumns = @JoinColumn(name = "flight_id"))
    private List<Flight>flights;

    @ManyToMany
    @JoinTable(name = "admins_package_holidays",
    joinColumns = @JoinColumn(name="admin_id"),
    inverseJoinColumns = @JoinColumn(name = "package_holiday_id"))
    private List<PackageHoliday> packageHolidays;

    public Admin() {
    }

    public Admin(String fullName, String emailAddress, String password, String adminPin) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.adminPin = adminPin;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdminPin() {
        return adminPin;
    }

    public void setAdminPin(String adminPin) {
        this.adminPin = adminPin;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}
