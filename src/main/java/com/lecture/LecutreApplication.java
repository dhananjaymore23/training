package com.lecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LecutreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LecutreApplication.class, args);
	}

}
