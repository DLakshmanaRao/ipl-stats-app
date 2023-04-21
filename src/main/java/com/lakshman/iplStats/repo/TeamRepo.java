package com.lakshman.iplStats.repo;

import com.lakshman.iplStats.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeamRepo extends JpaRepository<Team, UUID> {
}
