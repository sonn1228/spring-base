package com.sonnguyen.base_spring.model;

import jakarta.persistence.Id;
import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {
    @Id
    private String id;

    @Override
    public String getAuthority() {
        return this.id;
    }
}
