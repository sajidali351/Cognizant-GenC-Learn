package com.cts.springlearn.service;

import java.util.*;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.cts.springlearn.Country;
import com.cts.springlearn.controller.CountryController;
import com.cts.springlearn.exception.CountryNotFoundException;
@Service
public class CountryService {
	private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	List<Country> countryList = (List<Country>)context.getBean("countryList");
	
	public Country getCountry(String code){
	
	
	Country check=null;
	for(Country country:countryList) {
		if(country.getCode().equals(code))
				check=country;
	}
	return check;	

	}
	
	public void addCountry(Country country) {
		LOGGER.info("START");
		
		// Create validator factory
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        // Validation is done against the annotations defined in country bean
        Set<ConstraintViolation<Country>> violations = validator.validate(country);
        List<String> errors = new ArrayList<String>();

        // Accumulate all errors in an ArrayList of type String
        for (ConstraintViolation<Country> violation : violations) {
            errors.add(violation.getMessage());
        }

        // Throw exception so that the user of this web service receives appropriate error message
        if (violations.size() > 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, errors.toString());
        }
		
		countryList.add(country);
		LOGGER.debug(country.toString() + " added successfully");
		LOGGER.info("END");
				
	}
	
	public void deleteCountry(String code) {
		LOGGER.info("START");
		countryList.removeIf(t->t.getCode().equals(code));
		LOGGER.debug(code + " deleted successfully");
		LOGGER.info("END");
		
	}
	
	public List<Country> getAllCountries() {
		
		return countryList;
	}

}
