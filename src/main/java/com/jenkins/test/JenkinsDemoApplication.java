package com.jenkins.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static void main(String[] args) {
		System.out.println("Project JenkinsDemoApplication started.");
		SpringApplication.run(JenkinsDemoApplication.class, args);
		System.out.println("Project JenkinsDemoApplication Finished.");
	}

}
