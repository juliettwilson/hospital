package com.example.hospital.controller;

import com.example.hospital.entity.Dariger;
import com.example.hospital.service.DarigerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping("/darigers")
public class DarigerController {
    private final DarigerService darigerService;

    @PostMapping
    public Dariger createDariger(@RequestBody Dariger dariger) {
        return darigerService.createDariger(dariger);
    }

    @GetMapping
    public List<Dariger> getAllDarigers() {
        return darigerService.getAllDarigers();
    }

    @GetMapping("/{id}")
    public Dariger getDarigerById(@PathVariable Long id) {
        return darigerService.getDarigerById(id);
    }
}
