package com.lakshman.iplStats.auth.service;

import com.lakshman.iplStats.auth.domain.AppUser;
import com.lakshman.iplStats.auth.repo.AppUserRepo;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AppUserService implements UserDetailsService {

    private final AppUserRepo appUserRepo;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Looking for user details :{}", username);
        return (UserDetails) appUserRepo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User details are not found"));
    }

    public String registerUser(AppUser appUser) {
        appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
        appUser = appUserRepo.save(appUser);
        return "User saved with object :" + appUser.getId();
    }

    private List<UserDetails> userDetails;

    @PostConstruct
    public void init() {
        userDetails = new ArrayList<>(List.of(
                User.withUsername("user")
                        .password(passwordEncoder.encode("user@123")).authorities("ROLE_USER").build()
        ));
    }
}
