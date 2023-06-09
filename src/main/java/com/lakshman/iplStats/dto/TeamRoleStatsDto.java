package com.lakshman.iplStats.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@ToString
public class TeamRoleStatsDto {
    private String role;
    private double totalAmount;
    private String label;

    public TeamRoleStatsDto(String role, double totalAmount, String label) {
        this.role = role;
        this.totalAmount = totalAmount;
        this.label = label;
    }

    public TeamRoleStatsDto(String role) {
        this.role = role;
    }
}
