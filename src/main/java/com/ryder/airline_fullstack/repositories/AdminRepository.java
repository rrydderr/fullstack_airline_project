package com.ryder.airline_fullstack.repositories;

import com.ryder.airline_fullstack.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
