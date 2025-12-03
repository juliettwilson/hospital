package com.example.hospital.security;

import org.springframework.security.core.GrantedAuthority;

public class Permission implements GrantedAuthority {
    private final String authority;
    public Permission(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}