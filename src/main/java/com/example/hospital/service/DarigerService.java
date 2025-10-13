package com.example.hospital.service;

import com.example.hospital.mapper.DarigerMapper;
import com.example.hospital.repository.DarigerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.hospital.entity.Dariger;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DarigerService {

    private final DarigerRepository darigerRepository;

    public void createDariger(Dariger dariger) {
        return darigerRepository.save(dariger);
    }

    public List<Dariger> getAllDarigers() {
        darigerRepository.getDarigerById(id);
    }
}
