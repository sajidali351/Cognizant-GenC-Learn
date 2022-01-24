package com.cognizant.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cognizant.model.Trainer;

public class TrainerMapper implements RowMapper<Trainer> {

	@Override
	public Trainer mapRow(ResultSet resultSet, int i) throws SQLException {
		Trainer trainer = new Trainer();
		trainer.setTrainerId(resultSet.getInt("trainerid"));
		trainer.setPassword(resultSet.getString("password"));
		return trainer;
	}

}
