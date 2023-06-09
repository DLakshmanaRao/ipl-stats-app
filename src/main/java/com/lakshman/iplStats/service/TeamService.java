package com.lakshman.iplStats.service;

import com.lakshman.iplStats.dto.PlayerDto;
import com.lakshman.iplStats.dto.TeamBasicDto;
import com.lakshman.iplStats.dto.TeamDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

public interface TeamService {

    TeamDto addTeam(TeamDto teamDto);

    TeamDto addPlayer(String teamId, String playerId);

    List<TeamDto> addTeams(List<TeamDto> list);

    TeamDto addPlayers(String teamId, List<PlayerDto> playersDto);

    List<TeamBasicDto> getTeamBasicDetails();

    String uploadFile(MultipartFile file);

    String downloadData();

    List<PlayerDto> getPlayers(UUID teamId);
}
