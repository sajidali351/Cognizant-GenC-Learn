package com.cognizant.bakingo.controller;

import java.util.Date;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.bakingo.bean.Cake;
import com.cognizant.bakingo.service.CakeService;

@Controller
public class CakeController {

	@Autowired
	private CakeService cakeService;

	@RequestMapping(value = "/showCakeOrderForm", method = RequestMethod.GET)
	public String showCakeOrderForm(@ModelAttribute("cake") Cake cake) {

		return "placeOrder";
	}

	@RequestMapping(value = "/orderStatus", method = RequestMethod.POST)
	public String getOrderStatus(@Valid @ModelAttribute("cake") Cake cake, BindingResult result, ModelMap map) {

		if (result.hasErrors())
			return "placeOrder";

		
		cake.setFlavorRate(CakeService.flavorList.get(cake.getFlavor()));

		if (cake.getIncludeCandles() == null)
			cake.setIncludeCandles(0); 

		if (cake.getIncludeinscription() == null)
			cake.setIncludeinscription(0); 

		double price = cake.getSelectedcake() + cake.getFlavorRate() + cake.getIncludeCandles()
				+ cake.getIncludeinscription();

		cake.setPrice(price);

		int orderId = cakeService.addOrder(cake);

		
		map.addAttribute("cake", cake);
		map.addAttribute("indianPrice", cake.getPrice() * 75);
		map.addAttribute("orderId", orderId);
		map.addAttribute("orderDate", new Date().toString()); // Setting the orderDate object

		return orderId >= 1000 ? "orderStatus" : "placeOrder";
	}

	
	@ModelAttribute("flavorList")
	public Set<String> populateFillingList() {
		return CakeService.flavorList.keySet();
	}

}