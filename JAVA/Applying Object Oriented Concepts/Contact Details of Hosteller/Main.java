import java.util.Scanner;
public class Main {
		// TODO Auto-generated method stub
		public static Hosteller getHostellerDetails() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Details:");
			System.out.println("Student Id");
			int sId = sc.nextInt();
			
			System.out.println("Student Name");
			String name = sc.next();
			
			System.out.println("Department Id");
			int dId = sc.nextInt();
		
			System.out.println("Gender");
			String gender = sc.next();
			
			System.out.println("Phone Number");
			String phone = sc.next();
			
			System.out.println("Hostel Name");
			String HostelName = sc.next();
			
			System.out.println("Room Number");
			int roomNo = sc.nextInt();
			
			Hosteller hostel = new Hosteller();
			hostel.setStudentId(sId);
			hostel.setName(name);
			hostel.setDepartmentId(dId);
			hostel.setGender(gender);
			hostel.setPhone(phone);
			hostel.setHostelName(HostelName);
			hostel.setRoomNumber(roomNo);
			
			return hostel;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			Hosteller hostel = getHostellerDetails();
			
			
			System.out.println("Modify Room Number(Y/N)");
			String modifyRoom = sc.next();
			if(modifyRoom.equals("Y")) {
				System.out.println("New Room Number");
				int roomNo = sc.nextInt();
				hostel.setRoomNumber(roomNo);
				
			}
			
			System.out.println("Modify Phone Number(Y/N)");
			String modifyPhone = sc.next();
			
			if(modifyPhone.equals("Y")) {
				System.out.println("New Phone Number");
				String phone = sc.next();
				hostel.setPhone(phone);
			}
			
			System.out.println("The Student Details");
			System.out.println(hostel.getStudentId()+" "+hostel.getName()+" "+hostel.getDepartmentId()+" "+hostel.getGender()+" "+hostel.getPhone()+" "+hostel.getHostelName()+" "+hostel.getRoomNumber());
			
		}

	

}
