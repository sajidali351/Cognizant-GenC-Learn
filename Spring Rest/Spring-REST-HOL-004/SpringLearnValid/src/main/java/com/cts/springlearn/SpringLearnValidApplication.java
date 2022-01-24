package com.cts.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cts")
public class SpringLearnValidApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnValidApplication.class, args);
	}

}
