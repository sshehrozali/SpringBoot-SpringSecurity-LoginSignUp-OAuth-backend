package com.main.signuploginapp;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SignupLoginAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignupLoginAppApplication.class, args);
	}

}
