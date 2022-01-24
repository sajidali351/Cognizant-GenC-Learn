package com.cognizant.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.SpringLearn.Country;
import com.cognizant.exception.CountryNotFoundException;
import com.cognizant.service.CountryService;



@RestController
@RequestMapping("CountryService")
public class CountryController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
	@Autowired
	private CountryService countryService;

	
	@GetMapping("/country")
	public Country getCountryIndia(){
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		LOGGER.info("END");
		return context.getBean("in",Country.class);
	}
	
	@GetMapping("/countries")
	public List<Country> getAllCountries(){
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		LOGGER.info("END");
		return (List<Country>)context.getBean("countryList");
	}
	@RequestMapping("/countryCode/{code}")
	public Country getCountry(@PathVariable String code)
	{	
		
		Country country=countryService.getCountry(code);
		if(country==null) {
			throw new CountryNotFoundException("Country not Found");
		}
		else {
			return country;
		}
		
	}

	

}
