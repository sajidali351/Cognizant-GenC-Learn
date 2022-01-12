import java.util.Scanner;

public class UserInterface {
	
	public static CommissionInfo generateCommissionObtained () {
		CommissionInfo commissionInfo = (obj) -> {
			String classT = (String)obj.getClassType();
			if(classT.equalsIgnoreCase("1A") || classT.equalsIgnoreCase("2A") || classT.equalsIgnoreCase("3A"))
				{
					return 100;
				}
				return 60;
		};
		
		return commissionInfo;		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of passengers");
		int noOfPassenger = sc.nextInt();
		
		double sum =0;
		Ticket [] ticket = new Ticket[noOfPassenger];
		int k = 0;
		
		for(int i = 1; i <= noOfPassenger; i++ ) {
			System.out.println("Details of Passenger :" + i);
			System.out.println("Enter the pnr no:");
			long pnr = sc.nextLong();
			
			System.out.println("Enter passenger name:");
			String name = sc.next();
			
			System.out.println("Enter seat no:");
			int seatNo = sc.nextInt();
			
			System.out.println("Enter class type:");
			String classType = sc.next();
			
			System.out.println("Enter ticket fare:");
			int ticketFare = sc.nextInt();
			
			ticket[k++] = new Ticket(pnr, name, seatNo, classType, ticketFare);
		}
		
		System.out.println("Commission Obtained");
		CommissionInfo commission = generateCommissionObtained();
		
		for(int j = 0; j < k; j++) {
			sum += commission.calculateCommissionAmount(ticket[j]);
		}
		 System.out.printf("Commission obtained per each person: Rs.%.2f", sum);
		}
	
	

}
