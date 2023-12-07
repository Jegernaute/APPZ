package org.example.appz3.controller;

import lombok.AllArgsConstructor;
import org.example.appz3.model.Laptop;
import org.example.appz3.service.LaptopService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class MainController {
    private final LaptopService service ;
    @GetMapping(path = "/all")
    public @ResponseBody List<Laptop> all(){
        return service.findAll();
    }
}
