package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * This class contain main method with the required annotations to auto scans
 * the Controller, Service and model classes.
 * @author 2068574
 *
 */
@SpringBootApplication
@ComponentScan({"com.controller","com.model","com.service"})
public class MobileAccessoriesShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileAccessoriesShopApplication.class, args);
	}

}