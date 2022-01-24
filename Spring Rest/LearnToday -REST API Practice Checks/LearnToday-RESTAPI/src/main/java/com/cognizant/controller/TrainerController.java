package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Trainer;
import com.cognizant.service.TrainerService;

@RestController
@RequestMapping("/api")
public class TrainerController {

	@Autowired
	private TrainerService trainerService;
	
	
	@PostMapping("/Trainer")
	public ResponseEntity<Object> trainerSignUp(@RequestBody Trainer model) {
		try {
			boolean status = trainerService.trainerSignUp(model);
			if (!status) {
				throw new Exception();
			}
			return new ResponseEntity<Object>(model, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/Trainer/{id}")
	public ResponseEntity<Object> updatePassword(@PathVariable int id, @RequestBody Trainer model){
		try {
			boolean status = trainerService.updatePassword(id, model);
			if(!status) {
				throw new Exception();
			}
			return new ResponseEntity<Object>("Data updated successfully",HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<Object>("Searched Data not Found",HttpStatus.NOT_FOUND);
		}
	}
	
}
