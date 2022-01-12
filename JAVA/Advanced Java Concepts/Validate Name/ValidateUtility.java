import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidateUtility
{
    public static void main(String args[])
    {
        //fill code here
    	Scanner sc = new Scanner(System.in);
    	
    	String employee = sc.nextLine();
    	String product = sc.nextLine();
    	
    	Validate employeeName = validateEmployeeName();
    	boolean validEmp = employeeName.validateName(employee);
    	
    	if(validEmp) {
    		System.out.println("Employee name is valid");
    	}else {
    		System.out.println("Employee name is invalid");
    	}
    	
    	Validate productEmployee = validateProductName();
    	boolean validProduct = productEmployee.validateName(product);
    	
    	if(validProduct) {
    		System.out.println("Product name is valid");
    	}else {
    		System.out.println("Product name is invalid");
    	}
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
    	return name -> {
    		Pattern pattern = Pattern.compile("^[a-zA-Z\\s]{5,20}$");
    		Matcher match = pattern.matcher(name);
    		return match.matches();
    	};
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
    	return name -> {
    		Pattern pattern = Pattern.compile("^[a-zA-Z]\\d{5}$");
    		Matcher match = pattern.matcher(name);
    		return match.matches();
    	};
    }
}