package com.example.hospital.test;

import com.example.hospital.entity.Dariger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DarigerServiceTest {
    void testCreateDariger() {
        Dariger dariger = new Dariger();
        dariger.setName("doctor iz astany");
        dariger.setMamandyq("medik");
        dariger.setExperience(25);

        assertEquals("doctor iz astany", dariger.getName());
        assertEquals("medik", dariger.getMamandyq());
        assertEquals(25, dariger.getExperience());
    }


}
