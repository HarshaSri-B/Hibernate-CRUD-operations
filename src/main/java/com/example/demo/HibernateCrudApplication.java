package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateCrudApplication.class, args);
		System.out.println("Running");
	}

}
