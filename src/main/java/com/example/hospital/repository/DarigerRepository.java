package com.example.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hospital.entity.Dariger;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DarigerRepository extends JpaRepository<Dariger, Long> {
    List<Dariger> getDarigerById(Long id);
}
