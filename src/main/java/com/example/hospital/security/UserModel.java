package com.example.hospital.security;

import lombok.Data;

@Data
public class UserModel {
    private String name;
    private String username;
    private String password;
    private String role;
}
