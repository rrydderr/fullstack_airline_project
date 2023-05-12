package com.ryder.airline_fullstack.models;

import jakarta.persistence.*;

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
}
