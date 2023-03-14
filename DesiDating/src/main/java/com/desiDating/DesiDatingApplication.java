package com.desiDating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.desiDating")
public class DesiDatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesiDatingApplication.class, args);
	}

}
