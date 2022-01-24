package com.cognizant.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.Controller.CountryController;
import com.cognizant.SpringLearn.Country;
import com.cognizant.exception.CountryNotFoundException;
@Service
public class CountryService {
	private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
	public Country getCountry(String code){
	
	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	List<Country> countryList = (List<Country>)context.getBean("countryList");
	Country check=null;
	for(Country c:countryList) {
		if(c.getCode().equals(code))
				check=c;
	}
	return check;
	

	
		

	}

}
