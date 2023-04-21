package com.lakshman.iplStats.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lakshman.iplStats.domain.Team;
import lombok.*;

import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@ToString
@Getter
@Setter
public class PlayerDto {
    private UUID id;
    private String name;
    private String role;
    private String country;
    private double amount;
    @JsonIgnore
    private Team team;

    public PlayerDto(UUID id, String name, String role, String country, double amount, Team team) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.country = country;
        this.amount = amount;
        this.team = team;
    }
}
