import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student's Id:");
		int id = sc.nextInt();
		
		System.out.println("Enter Student's Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter Student's address:");
		String address = sc.nextLine();
		
		boolean isNIT = false;
		String collegename = "";
		
		while(true) {
			System.out.println("Whether the student is from NIT(Yes/No):");
			String input = sc.nextLine();
			
			if(input.equals("YES") || input.equals("yes")){
					isNIT = true;
					break;					
		}
		else if(input.equals("NO") || input.equals("no")) {
			System.out.println("Enter the college name:");
			collegename = sc.nextLine();
			break;
		}

	}
	Student stu;
	if(isNIT) {
		stu = new Student(id, name, address);
	}
	else {
		stu = new Student(id, name, address, collegename);
	}
	System.out.println("Student id:" + stu.getStudentId());
	System.out.println("Student name:" + stu.getStudentName());
	System.out.println("Address:" + stu.getStudentAddress());
	System.out.println("College name:" + stu.getCollegeName());
}
}
