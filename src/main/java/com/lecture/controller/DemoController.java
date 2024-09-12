package com.lecture.controller;

import com.lecture.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoService demoService1;

    public DemoController(DemoService demoService1) {
        this.demoService1 = demoService1;
    }

    @GetMapping("/test-cron")
    public void testCron(){
        demoService1.testCron();
    }

}
