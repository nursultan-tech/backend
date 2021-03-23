package com.example.computer.repository;

import com.example.computer.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository
        extends JpaRepository<Computer, Long> {

}
