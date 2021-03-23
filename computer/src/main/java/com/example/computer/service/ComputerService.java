package com.example.computer.service;

import com.example.computer.model.Computer;

import java.util.List;

public interface ComputerService {
    List<Computer> findAllComputers();
    Computer findComputerById(Long id);
    Computer saveComputer(Computer c);
    void deleteComputer(Long id);
    Computer updateComputer(Long id, Computer c);
}
