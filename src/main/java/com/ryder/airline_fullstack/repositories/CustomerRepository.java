package com.ryder.airline_fullstack.repositories;

import com.ryder.airline_fullstack.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
