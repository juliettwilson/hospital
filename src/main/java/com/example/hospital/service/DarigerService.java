package com.example.hospital.service;

import com.example.hospital.entity.Dariger;
import com.example.hospital.repository.DarigerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DarigerService {

    private final DarigerRepository darigerRepository;

    public Dariger createDariger(Dariger dariger) {
        return darigerRepository.save(dariger);
    }

    public List<Dariger> getAllDarigers() {
        return darigerRepository.findAll();
    }

    public Dariger getDarigerById(Long id) {
        return darigerRepository.findById(id).orElse(null);
    }
}

