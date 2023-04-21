package com.lakshman.iplStats.dto;

import lombok.Data;

@Data
public class RoleDto {

    private String role;

    public RoleDto(String role) {
        this.role = role;
    }
}
