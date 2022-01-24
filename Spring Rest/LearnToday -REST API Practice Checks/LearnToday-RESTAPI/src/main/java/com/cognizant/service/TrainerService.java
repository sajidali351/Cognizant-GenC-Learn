package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.TrainerDao;
import com.cognizant.model.Trainer;

@Service
public class TrainerService {

	@Autowired
	private TrainerDao trainerDao;
	
	public boolean updatePassword(int id, Trainer model) {
		return trainerDao.updatePassword(id, model);
	}
	
	public boolean trainerSignUp(Trainer model) {
		return trainerDao.insertTrainer(model);
	}
	
}
