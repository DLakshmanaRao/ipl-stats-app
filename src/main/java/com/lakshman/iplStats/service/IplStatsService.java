package com.lakshman.iplStats.service;

import com.lakshman.iplStats.dto.*;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface IplStatsService {

    List<TeamStatDto> getTeamStats();

    List<TeamRoleStatsDto> getTeamRoleStats(UUID id);

    List<RoleStatsDto> getRoleStats();

    List<TeamCountryStatsDto> getTeamCountryStats(UUID id);

    List<PlayerTeamRoleStats> getPlayerTeamRoleStats(UUID id, String role);

    List<PlayerTeamRoleStats> getPlayerTeamCountryStats(UUID id, String country);

    List<TeamBasicDto> getTeambyTeam(@Param("id") UUID id);

}
