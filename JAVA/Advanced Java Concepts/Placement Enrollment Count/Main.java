import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//Fill your code here
		System.out.println("Enter all roll numbers separated by comma");
		String rollNo = sc.nextLine();
		
		Stream<String> rollNoStream = getRollNumbers(rollNo);
		
		System.out.println("Enter the department name acronym");
		String abbr = sc.nextLine();
		
		int count = getCount(rollNoStream, abbr);
		
		if(count > 0) {
			System.out.println("Number of students in " + abbr + "is " + count);
		}
		else {
			System.out.println("No students from " + abbr);
		}


	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		//Fill your code here
		return Arrays.stream(rollNumbers.split(","));


	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		//Fill your code here
		return (int) rollNumberStream.filter(rollNumber -> rollNumber.substring(0,2).equalsIgnoreCase(dept)).count();



	}

}
