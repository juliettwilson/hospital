package com.example.hospital.controller;

import com.example.hospital.entity.Dariger;
import com.example.hospital.service.DarigerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class DarigerController {
    private final DarigerService darigerService;

    @PostMapping("/darigers")
    public void create(Dariger dariger) {
        darigerService.save(dariger);
    }

    @GetMapping
    public List<Dariger> getAll() {
        darigerService.getAllDarigers();
    }

}
