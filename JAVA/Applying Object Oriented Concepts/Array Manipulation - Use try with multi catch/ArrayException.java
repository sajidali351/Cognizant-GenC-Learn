import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
	
	public String getPriceDetails() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int arraySize = sc.nextInt();
			
			System.out.println("Enter the price details");
			int element[] = new int[arraySize];
			for(int i = 0; i < arraySize; i++) {
				element[i] = sc.nextInt();
				
			}
			
			System.out.println("Enter the index of the array element you want to access");
			int search = sc.nextInt();
			return "The array element is "+ element[search];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return "Array index is out of range";
		}
		catch (InputMismatchException e) {
			return "Input was not in the correct format";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ArrayException().getPriceDetails());
		
		
		

	}
	

}
