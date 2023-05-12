package com.ryder.airline_fullstack.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name= "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long id;

    @Column
    private String fullName;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String passportNumber;

    @Column
    private LocalDate dateOfBirth;

    @Column
    private String phoneNumber;

    @Column
    private String homeAddress;

    //need the many to many relationship with flights

    public Customer() {
    }

    public Customer(String fullName, String email, String password, String passportNumber, LocalDate dateOfBirth, String phoneNumber, String homeAddress) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
