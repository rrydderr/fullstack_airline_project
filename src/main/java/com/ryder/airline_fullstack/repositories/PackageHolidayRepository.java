package com.ryder.airline_fullstack.repositories;

import com.ryder.airline_fullstack.models.PackageHoliday;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageHolidayRepository extends JpaRepository<PackageHoliday, Long> {

    //filter by destination, price, length etc..
}
