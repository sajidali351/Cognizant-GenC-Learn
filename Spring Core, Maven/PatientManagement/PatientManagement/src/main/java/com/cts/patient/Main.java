package com.cts.patient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.patient.service.PatientService;

public class Main {

	public static void main(String[] args) {
	//fill the code
		ApplicationContext context = new AnnotationConfigApplicationContext("com.cts.patient.config.AppConfig.class");
		PatientService patientService = context.getBean(PatientService.class);
		patientService.getPatientDetails();

	}

}
