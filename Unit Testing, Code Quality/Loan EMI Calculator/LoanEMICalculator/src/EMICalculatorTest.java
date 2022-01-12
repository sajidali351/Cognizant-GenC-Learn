import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class EMICalculatorTest {

//Write JUNIT Test Code
	@Test
	public void testcalculateEMIForHouse() {
		EMICalculator calculator = new EMICalculator();
		assertEquals(278.29196642016706, calculator.calculateEMI(10000, "Housing Loan", 3), 0.0000001);
	}
	
	@Test
	public void testcalculateEMIForVehicle() {
		EMICalculator calculator = new EMICalculator();
		assertEquals(278.2490944700267, calculator.calculateEMI(10000, "Vehicle Loan", 3), 0.0000001);
	}
	
	@Test
	public void testcalculateEMIForPersonal() {
		EMICalculator calculator = new EMICalculator();
		assertEquals(278.2062266820467, calculator.calculateEMI(10000, "Personal Loan", 3), 0.0000001);
	}
	
	@Test
	public void testcalculateEMI() {
		EMICalculator calculator = new EMICalculator();
		assertEquals(00.00, calculator.calculateEMI(9000, "Personal Loan", 3), 0.0000001);
	}

    
}
