package com.cts.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;


import com.cts.utility.Book;
import com.cts.utility.GenerateISBN;

//Provide necessary Annotation to class, attributes and test methods
@RunWith(MockitoJUnitRunner.class)
public class GenerateISBNTest {
		@Mock
        Book book;
        
		@InjectMocks
        GenerateISBN service;
        
		@Rule
        public ExpectedException exceptionRule = ExpectedException.none();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSuccess() {
	    	//fill code
		service.assignISBN("ISBN0001");
		verify(book, times(1)).setIsbn("ISBN0001");

	}
	
	@Test
	public void testFailed() {
	    	//fill code
		exceptionRule.expect(RuntimeException.class);
		exceptionRule.expectMessage("Invalid Code");
		service.assignISBN("ISBN001");
		verify(book, never()).setIsbn("ISBN001");

	}

	@Test
	public void testException() {
	    	//fill code
		exceptionRule.expect(RuntimeException.class);
		exceptionRule.expectMessage("Invalid Code");
		service.assignISBN("ISBN001");

	}
}
