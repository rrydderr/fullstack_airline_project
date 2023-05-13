package com.ryder.airline_fullstack.models;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("camping_holidays")

public class CampingPackageHoliday extends PackageHoliday {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long id;

    public CampingPackageHoliday() {
        super();
    }

    public CampingPackageHoliday(String packageName, Double price, String destination, String description, int duration, AccommodationType accommodationType) {
        super(packageName, price, destination, description, duration, accommodationType);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
