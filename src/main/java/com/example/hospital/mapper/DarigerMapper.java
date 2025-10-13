package com.example.hospital.mapper;
import com.example.hospital.dto.DarigerDTO;
import com.example.hospital.entity.Dariger;

@Mapper(componentModel = "spring")
public interface DarigerMapper {

    DarigerDTO toDto(Dariger dariger);
    Dariger toEntity(DarigerDTO dto);

}
