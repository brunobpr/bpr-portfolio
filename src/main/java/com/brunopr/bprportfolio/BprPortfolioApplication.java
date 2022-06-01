package com.brunopr.bprportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BprPortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(BprPortfolioApplication.class, args);
	}

	@GetMapping()
	public String HomePage(){
		return "Hello World!";
	}
}
