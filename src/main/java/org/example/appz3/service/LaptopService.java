package org.example.appz3.service;

import lombok.AllArgsConstructor;
import org.example.appz3.model.Laptop;
import org.example.appz3.repo.LaptopRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LaptopService {
    private final LaptopRepository repository;
    public List<Laptop> findAll(){
        return  repository.findAll();
    }
}