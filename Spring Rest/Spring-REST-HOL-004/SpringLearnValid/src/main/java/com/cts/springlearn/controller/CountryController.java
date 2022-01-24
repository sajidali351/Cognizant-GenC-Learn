package com.cts.springlearn.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.tomcat.util.http.parser.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cts.springlearn.Country;
import com.cts.springlearn.exception.CountryNotFoundException;
import com.cts.springlearn.service.CountryService;



@RestController
@RequestMapping("/CountryService")
@Validated
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
		LOGGER.info("END");
		return countryService.getAllCountries();
	}
	@GetMapping("/country/{code}")
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
	@PostMapping(value="/addCountry")
	public void addCountry(@Valid @RequestBody Country country) {
		countryService.addCountry(country);
		LOGGER.debug("added {}", country);
		
		
	}
	@DeleteMapping("/deleteCountry/{code}")
	public void deleteCountry(@PathVariable String code) {
		countryService.deleteCountry(code);
		
	}
	
}
