package com.example.computer.controller;

import com.example.computer.model.Computer;
import com.example.computer.service.ComputerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ComputerController.URL_COMPUTER)
public class ComputerController {
    public static final String URL_COMPUTER = "/api/computers";
    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }
    @GetMapping
    public List<Computer> getComputers(){
        return this.computerService.findAllComputers();
    }
    @GetMapping("/{id}")
    public Computer getComputerById(@PathVariable Long id){
        return this.computerService.findComputerById(id);
    }
    @PostMapping("/create")
    public Computer saveComputer(@RequestBody Computer c){
        return this.computerService.saveComputer(c);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteComputer(@PathVariable Long id){this.computerService.deleteComputer(id);}
    @PutMapping("/update/{id}")
    public void updateComputer(@PathVariable Long id, @RequestBody Computer c){
        this.computerService.updateComputer(id, c);
    }
}
