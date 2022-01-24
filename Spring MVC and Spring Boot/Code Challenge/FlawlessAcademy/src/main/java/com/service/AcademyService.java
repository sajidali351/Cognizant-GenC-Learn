package com.service;

import org.springframework.stereotype.Service;

import com.model.Academy;

//use appropriate annotation to configure AcademyService as a Service class
@Service
public class AcademyService {
	
	//calculate the Program cost and return the amount
	public double calculateProgramCost (Academy academyBean) {
		
		double cost=0.0;
		//fill the code0	
		academyBean.setWeeksPerMonth(4);
		System.out.println(academyBean.getSessionsPerWeek() + " " + academyBean.getProgram()+
				" "+ academyBean.getWeeksPerMonth());
		if(academyBean.getProgram().equalsIgnoreCase("ClassicalDance") && academyBean.getSessionsPerWeek() >= 1)
		{
			academyBean.setCostPerSession(150.0);
			cost = academyBean.getCostPerSession() * academyBean.getSessionsPerWeek() *
					academyBean.getWeeksPerMonth();
		}
		
		else if(academyBean.getProgram().equalsIgnoreCase("KarnaticVocals") && academyBean.getSessionsPerWeek() >= 1)
		{
			academyBean.setCostPerSession(100.0);
			cost = academyBean.getCostPerSession() * academyBean.getSessionsPerWeek() *
					academyBean.getWeeksPerMonth();
		}
		
		else if(academyBean.getProgram().equalsIgnoreCase("WesternDance") && academyBean.getSessionsPerWeek() >= 1)
		{
			academyBean.setCostPerSession(125.0);
			cost = academyBean.getCostPerSession() * academyBean.getSessionsPerWeek() *
					academyBean.getWeeksPerMonth();
		}
		
		 if(academyBean.getProgram().equalsIgnoreCase("Drawing") && academyBean.getSessionsPerWeek() >= 1)
		{
			academyBean.setCostPerSession(130.0);
			cost = academyBean.getCostPerSession() * academyBean.getSessionsPerWeek() *
					academyBean.getWeeksPerMonth();
		}
		
		else if(academyBean.getProgram().equalsIgnoreCase("Instruments") && academyBean.getSessionsPerWeek() >= 1)
		{
			academyBean.setCostPerSession(200.0);
			cost = academyBean.getCostPerSession() * academyBean.getSessionsPerWeek() *
					academyBean.getWeeksPerMonth();
		}
	return cost;
		
	}

}
