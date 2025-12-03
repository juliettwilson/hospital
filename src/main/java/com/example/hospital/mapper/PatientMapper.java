package com.example.hospital.mapper;

import com.example.hospital.entity.Patient;
import com.example.hospital.dto.PatientDTO;


public interface PatientMapper {

    PatientDTO toDTO(Patient patient);

    Patient toEntity(PatientDTO dto);
}
