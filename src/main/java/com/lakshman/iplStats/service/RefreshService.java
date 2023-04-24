package com.lakshman.iplStats.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RefreshService {

    @Scheduled(fixedRate = 72000)
    public void refreshWeb() {
        log.info("refreshed the web apploication");
    };
}
