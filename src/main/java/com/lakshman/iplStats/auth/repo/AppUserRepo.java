package com.lakshman.iplStats.auth.repo;

import com.lakshman.iplStats.auth.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AppUserRepo extends JpaRepository<AppUser, UUID> {
    Optional<AppUser> findByUsername(String username);
}
