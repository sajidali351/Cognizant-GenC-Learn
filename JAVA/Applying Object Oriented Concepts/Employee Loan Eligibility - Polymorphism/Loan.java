
public class Loan {
	
	//Implement the below method 
	
	//public double calculateLoanAmount(Employee employeeObj) {
		
	//}
	public double calculateLoanAmount(Employee employee) {
		double loan = 0.0;
		if (employee instanceof PermanentEmployee) {
			loan = employee.getSalary() * 0.15;
		}
		if (employee instanceof TemporaryEmployee) {
			loan = employee.getSalary() * 0.10;
		}
		
		return loan;
	}
}
