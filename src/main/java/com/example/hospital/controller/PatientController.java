package com.example.hospital.controller;

import com.example.hospital.entity.Patient;
import com.example.hospital.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class PatientController {
    private final PatientService patientService;

    @PostMapping("/patients")
    private void create(Patient patient) {
        patientService.save(patient);
    }

            @GetMapping
    public List<Patient> getAll() {
        patientService.getAllPatients();
            }
}
