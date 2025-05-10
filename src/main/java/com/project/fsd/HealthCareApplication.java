package com.project.fsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealthCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareApplication.class, args);
		System.out.println("Health-care application Back-end is running");
	}

}
