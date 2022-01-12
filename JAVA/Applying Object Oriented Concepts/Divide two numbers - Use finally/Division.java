import java.util.Scanner;

public class Division {
	public String divideTwoNumbers(int number1,int number2) {
		int result;
		try {
			
			 result = number1 / number2;
		}catch (ArithmeticException e) {
			// TODO: handle exception
			return "Division by zero is not possible. Thanks for using the application.";
		}
		return "The answer is "+ result +". Thanks for using the application.";
		
	}
	public static void main(String[] args) {
		Division division = new Division();
		Scanner sc = new Scanner(System.in);
		int number1, number2;
		System.out.println("Enter the numbers");
		 number1 = sc.nextInt();
		 number2 = sc.nextInt();
		System.out.println(division.divideTwoNumbers(number1, number2));
	}

}
