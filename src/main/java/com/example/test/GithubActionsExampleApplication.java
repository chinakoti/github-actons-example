package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsExampleApplication {

	@GetMapping("/")
	public String getMessage(){
		return "Welcome to Spring Gut hub actions";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubActionsExampleApplication.class, args);
	}

}
