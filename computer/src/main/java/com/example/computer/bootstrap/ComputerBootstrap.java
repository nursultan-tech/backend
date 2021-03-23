package com.example.computer.bootstrap;

import com.example.computer.repository.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ComputerBootstrap implements CommandLineRunner {
    private final ComputerRepository computerRepository;

    public ComputerBootstrap(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}