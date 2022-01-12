public class Main{
    
    public static void main(String args[]){
        
    	Customer customer = new Customer(101, "Ali", "Ali@gmail.com");
    	SavingsAccount saving = new SavingsAccount(901, customer, 30000, 1000);
    	
    	if (saving.withdraw(5000)) {
    		System.out.println(saving.getBalance());
    	}
    }
}