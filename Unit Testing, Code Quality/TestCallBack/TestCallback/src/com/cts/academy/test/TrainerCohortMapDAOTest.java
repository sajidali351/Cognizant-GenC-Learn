package com.cts.academy.test;

import static org.mockito.Matchers.any;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import com.cts.academy.dao.TrainerCohortMapDAO;
import com.cts.academy.model.Cohort;

@RunWith(MockitoJUnitRunner.class)
public class TrainerCohortMapDAOTest {

	//Mock and rule
	@Mock
	TrainerCohortMapDAO dao;
	
	@Mock
	Cohort cohort;
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	

	@Before
	public void setUp() throws Exception {
		
		Mockito.doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) throws Throwable {
				//Code here...
				Object [] args = invocation.getArguments();
				String trainerId = (String) args[0];
				String cohortCode = (String) args[1];
				
				if(!trainerId.startsWith("t-")){
					throw new RuntimeException("Invalid Trainer ID");
				}
				if(!cohortCode.matches("^[A-Z]{3}\\d{2}[A-Z]{2}\\d{3}$")){
					throw new RuntimeException("Invalid Cohort Code");
				}
				cohort.setTrainerId(trainerId);
				
				return null;
			}
		}).when(dao).mapTrainerCohort(any(String.class), any(String.class));
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSuccess() {
		try {
			dao.mapTrainerCohort("t-Jerry", "CHN00AJ000");
		}catch(Exception ex) {
			
		}
		//code here
		Mockito.verify(cohort).setTrainerId("t-Jerry");
	}

	@Test
	public void testTrainerId() {
		//code here
		exceptionRule.expect(RuntimeException.class);
		exceptionRule.expectMessage("Invalid Trainer ID");
		dao.mapTrainerCohort("Jerry", "CHN19AJ021");
	}
	
	@Test
	public void testCohortCode() {
		//code here
		exceptionRule.expect(RuntimeException.class);
		exceptionRule.expectMessage("Invalid Cohort Code");
		dao.mapTrainerCohort("t-Jerry", "AJ021");
	}
}
