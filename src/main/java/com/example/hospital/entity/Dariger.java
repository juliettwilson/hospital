package com.example.hospital.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dariger")
public class Dariger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String mamandyq;
    private int experience;
}
