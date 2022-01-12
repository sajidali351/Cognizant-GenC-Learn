import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Candidate candidate = getCandidateDetails();
			System.out.println("Registration Successful");
			
		}
		catch (InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static Candidate getCandidateDetails() throws InvalidSalaryException{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the candidate Details");
		System.out.println("Name");
		String name = sc.next();
		
		System.out.println("Gender");
		String gender = sc.next();
		
		System.out.println("Expected Salary");
		double expectedSalary = sc.nextInt();
		if(expectedSalary < 10000) {
			throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
			
		}
		else {
			Candidate canditate = new Candidate();
			canditate.setName(name);
			canditate.setGender(gender);
			canditate.setExpectedSalary(expectedSalary);
			return canditate;
			
		}
	}

}
