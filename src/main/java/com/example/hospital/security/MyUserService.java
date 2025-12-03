package com.example.hospital.security;

import org.springframework.stereotype.Service;

@Service
public class MyUserService {

    public MyUserService(String username) {

        UserModel user = new UserModel();
        user.setUsername("aizh");
        user.setPassword("1234m");
        user.setRole(Roles.USER);


        return username;

    }
}