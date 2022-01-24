package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.Order;
import com.service.BillService;

/**
 * The BillController class is the class for Controller and all the mapping for 
 * JSP are done here.
 * @author 2068574
 *
 */
@Controller
public class BillController {

	/**
	 * BillService class is autowired inside the Controller via annotations
	 * Autowired
	 */
	@Autowired
	private BillService billService;
	
	/**
	 * The populateProductType method is use to add all the 5-product
	 * name into the Map that is HeadPhone, TravelAdapter, MemoryCard, PenDrive, USBCable.
	 * @return serviceMap
	 */
	@ModelAttribute("productList")
	public Map<String, String> populateProductType() {
		Map<String, String> serviceMap = new HashMap<String, String>();
		serviceMap.put("HeadPhone", "HeadPhone");
		serviceMap.put("TravelAdapter", "TravelAdapter");
		serviceMap.put("MemoryCard", "MemoryCard");
		serviceMap.put("PenDrive", "PenDrive");
		serviceMap.put("USBCable", "USBCable");
		return serviceMap;
	}

	/**
	 * The showPage method is use to redirect the user to showpage.jsp
	 * by using GET method
	 * @param order is a model attribute
	 * @return showpage.jsp
	 */
	@GetMapping("/showPage")
	public String showPage(@ModelAttribute("order") Order order) {
		return "showpage";
	}

	
	/**
	 * The calculateTotalCost method is use to calculate total amount for order
	 * and redirect us to billdesk.jsp by using POST method
	 * @param order is a model attribute
	 * @param result is of type Binding result
	 * @param model is a Model map
	 * @return billdesk.jsp
	 */
	@PostMapping("/billDesk")
	public String calculateTotalCost(@Valid @ModelAttribute("order") Order order, BindingResult result, 
			ModelMap model) {

		if (result.hasErrors()) {
			return "showpage";
		} else {
			double totalCost = billService.calculateTotalCost(order);
			model.put("customerName", order.getCustomerName());
			model.put("totalCost", totalCost);
			return "billdesk";
		}

	}

}
