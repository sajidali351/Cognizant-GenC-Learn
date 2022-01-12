import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;


public class Main {
	
	private static Map <String,Double> employeeMap = new HashMap<>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		// Fill the code
		employeeMap.put(employeeName,salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
		
		// Fill the code
		EmployeeAudit emp = x ->{
			ArrayList<String> name = new ArrayList<>();
			for(Entry<String, Double> entry: employeeMap.entrySet())
			{
				if(entry.getValue() <= x) {
					name.add(entry.getKey());
					
				}
			}
			return name;
		};
		return emp;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		// Fill the code
		int f = 0;
		while(f == 0) {
			System.out.println("1.Add Employee Details");
			System.out.println("2.Find Employee Details");
			System.out.println("3.Exit");
			System.out.println("Enter the choice");
			
			int choice = sc.nextInt();
			
			if(choice == 1 || choice ==2 || choice ==3) {
			
			switch (choice) {
			case 1:
				System.out.println("Enter the Employee name");
				String name = sc.next();
				
				System.out.println("Enter the Employee Salary");
				double salary = sc.nextDouble();
				
				Main mainObj = new Main();
				mainObj.addEmployeeDetails(name, salary);
				break;
			
			case 2:
				System.out.println("Enter the salary to be searched");
				double salarySearch = sc.nextDouble();
				EmployeeAudit emp = findEmployee();
				ArrayList<String> search = emp.fetchEmployeeDetails(salarySearch);
				
				if(search.isEmpty()) {
					System.out.println("No Employee found");
				}else {
					System.out.println("Employee List");
					for(int i =0; i < search.size(); i++) {
						System.out.println(search.get(i));
					}
					
				}
				break;
			case 3:
				System.out.println("Let's complete the session");	
				f = 1;
				break;
			}
			}
			else {
				System.out.println("Check your code with the input :");
			}
		}
	}

}
