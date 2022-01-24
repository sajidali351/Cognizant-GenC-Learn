package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Country;

@SpringBootApplication
@ComponentScan("com.cognizant.*")
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) throws ParseException
	{
		SpringApplication.run(SpringLearnApplication.class, args);
		displayCountry();
		displayCountries();
	}

	public static void displayCountry() {

		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());
	
		LOGGER.info("END");
	}

	public static void displayCountries() {

		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country> countries = (List<Country>) context.getBean("countryList");
		LOGGER.debug("Country : {}", countries);
		LOGGER.info("END");
	}


}
