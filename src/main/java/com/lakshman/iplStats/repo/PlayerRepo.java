package com.lakshman.iplStats.repo;

import com.lakshman.iplStats.domain.Player;
import com.lakshman.iplStats.dto.CountryDto;
import com.lakshman.iplStats.dto.RoleDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface PlayerRepo extends JpaRepository<Player, UUID> {

    @Query("select new com.lakshman.iplStats.dto.RoleDto(p.role) from Player p join p.team t where t.id=:id group by p.role")
    public List<RoleDto> selectRoles(@Param("id") UUID id);

    @Query("select new com.lakshman.iplStats.dto.CountryDto(p.country) from Player p join p.team t where t.id=:id group by p.country")
    public List<CountryDto> selectCountry(@Param("id") UUID id);

}
