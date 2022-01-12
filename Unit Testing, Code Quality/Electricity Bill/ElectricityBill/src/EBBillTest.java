import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;


public class EBBillTest
{
    
    
    //Write JUNIT Test Code 
	 @Test
		public void testcalculateBillAmountUnit0() {
	    	EBBill bill = new EBBill(0);
	    	assertEquals(00.00, bill.calculateBillAmount(), 0.01);
	    	/*assertEquals(130.00, bill.calculateBillAmount());*/
		}
	 
    @Test
	public void testcalculateBillAmountUnit50() {
    	EBBill bill = new EBBill(50);
    	assertEquals(130.00, bill.calculateBillAmount(), 0.01);
    	/*assertEquals(130.00, bill.calculateBillAmount());*/
	}
    @Test
    public void testcalculateBillAmountUnit100() {
    	EBBill bill = new EBBill(100);
    	
    	assertEquals(292.50, bill.calculateBillAmount(), 0.01);
    	
	}
    @Test
    public void testcalculateBillAmountUnit200() {
    	EBBill bill = new EBBill(200);
    	assertEquals(818.50, bill.calculateBillAmount(), 0.01);
	}
    @Test
    public void testcalculateBillAmountUnit1000() {
    	EBBill bill = new EBBill(1000);
    	assertEquals(7018.50, bill.calculateBillAmount(), 0.01);
	}
    
    @Test
    public void testcalculateBillAmountUnit5000() {
    	EBBill bill = new EBBill(5000);
    	assertEquals(47018.50, bill.calculateBillAmount(), 0.01);
	}
}