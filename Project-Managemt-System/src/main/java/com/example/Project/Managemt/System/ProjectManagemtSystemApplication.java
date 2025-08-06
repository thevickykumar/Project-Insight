package com.example.Project.Managemt.System;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectManagemtSystemApplication {

	public static void main(String[] args) {
		// Load .env file
		Dotenv dotenv = Dotenv.load();

		// Set properties using keys from .env file
		System.setProperty("spring.datasource.url", dotenv.get("DB_URL"));
		System.setProperty("spring.datasource.username", dotenv.get("DB_USERNAME"));
		System.setProperty("spring.datasource.password", dotenv.get("DB_PASSWORD"));

		System.setProperty("spring.mail.username", dotenv.get("MAIL_USERNAME"));
		System.setProperty("spring.mail.password", dotenv.get("MAIL_PASSWORD"));

		System.setProperty("razorpay.api.key", dotenv.get("RAZORPAY_KEY"));
		System.setProperty("razorpay.api.secret", dotenv.get("RAZORPAY_SECRET"));

		// Properties that are not in the .env file can be set directly or remain in application.properties
		// No need to set properties that are already correctly configured in application.properties
		// or that have a fixed value.

		SpringApplication.run(ProjectManagemtSystemApplication.class, args);
	}
}