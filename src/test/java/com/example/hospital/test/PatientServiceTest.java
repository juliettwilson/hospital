package com.example.hospital.test;

import com.example.hospital.entity.Patient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PatientServiceTest {
    void testCreatePatient() {

        Patient patient = new Patient();
        patient.setName("testik");
        patient.setAge(30);
        patient.setPhone("87074447898");

        assertEquals("testik", patient.getName());
        assertEquals(30, patient.getAge());
        assertEquals("87074447898", patient.getPhone());
    }
}