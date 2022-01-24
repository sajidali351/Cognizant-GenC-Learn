package com.cognizant.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Trainer;

@Repository
public class TrainerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String INSERT_TRAINER = "insert into trainer values(?,?);";
	private static final String UPDATE_PASSWORD = "update trainer set password = ? where trainerid= ?;";
	
	public boolean insertTrainer(Trainer trainer) {
		if(jdbcTemplate.update(INSERT_TRAINER,trainer.getTrainerId(),trainer.getPassword()) != 0) {
			return true;
		}return false;
	}
	
	public boolean updatePassword(int id, Trainer trainer) {
		if(jdbcTemplate.update(UPDATE_PASSWORD,trainer.getPassword(),id) != 0) {
			return true;
		}return false;
	}
	
}
