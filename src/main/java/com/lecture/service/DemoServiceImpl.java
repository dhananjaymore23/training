package com.lecture.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DemoServiceImpl implements DemoService {

    public void cronTest() {

    }

    @Override
    @Scheduled(cron = "* * * * * *")
    public void testCron() {
        log.info("Testing cron");
    }
}
