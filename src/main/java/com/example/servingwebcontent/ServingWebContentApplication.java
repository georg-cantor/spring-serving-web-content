package com.example.servingwebcontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * `@SpringBootApplication` is a convenience annotation that adds all of the following:
 * `@Configuration`: Tags the class as a source of bean definitions for the application context.
 */
@SpringBootApplication
public class ServingWebContentApplication {

	/*
	The main() method uses Spring Boot’s SpringApplication.run() method to launch an application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(ServingWebContentApplication.class, args);
	}

}
