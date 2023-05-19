package com.ryder.airline_fullstack.repositories;

import com.ryder.airline_fullstack.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository <Flight, Long> {
}
