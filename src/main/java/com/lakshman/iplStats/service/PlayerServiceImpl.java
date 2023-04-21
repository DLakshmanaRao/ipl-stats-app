package com.lakshman.iplStats.service;

import com.lakshman.iplStats.domain.Player;
import com.lakshman.iplStats.dto.CountryDto;
import com.lakshman.iplStats.dto.PlayerDto;
import com.lakshman.iplStats.dto.RoleDto;
import com.lakshman.iplStats.repo.PlayerRepo;
import com.lakshman.iplStats.util.Convertor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepo playerRepo;

    @Override
    public PlayerDto addPlayer(PlayerDto playerDto) {
        Player player = Convertor.toPlayer(playerDto);
        player = playerRepo.save(player);
        log.info("Player is created with id :{}", player.getId());
        playerDto = Convertor.toPlayerDto(player);
        return playerDto;
    }

    @Override
    public List<RoleDto> getRoles(UUID id) {
        return playerRepo.selectRoles(id);
    }

    @Override
    public List<CountryDto> getCountry(UUID id) {
        return playerRepo.selectCountry(id);
    }
}
