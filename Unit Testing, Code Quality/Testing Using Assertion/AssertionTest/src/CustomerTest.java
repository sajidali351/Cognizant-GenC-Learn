import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
	//Write the code for testing assertion using JUNIT
	
	Customer customer = new Customer("345216789534", "Arvind", "Kumar", "Delhi", 34215678, "skda@gmail.com");
	@Test
	public void testAadhar() {
		assertTrue(Customer.isValidAadharNo("235647179843"));
	}
	
	@Test
	public void testName() {
		
		assertNotEquals(customer.getFirstName(), customer.getLastName());
	}
	
	@Test
	public void testEmail() {
		
		assertNotNull(customer.getEmailId());
		//assertNotNull(message, object);
	}

}
