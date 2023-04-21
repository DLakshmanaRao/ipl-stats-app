package com.lakshman.iplStats.service;

import com.lakshman.iplStats.dto.CountryDto;
import com.lakshman.iplStats.dto.PlayerDto;
import com.lakshman.iplStats.dto.RoleDto;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface PlayerService {

    public PlayerDto addPlayer(PlayerDto playerDto);

    List<RoleDto> getRoles(@Param("id") UUID id);

    List<CountryDto> getCountry(@Param("id") UUID id);

}
