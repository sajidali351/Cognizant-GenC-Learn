import java.util.Scanner;
public class Main{
   
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        
        /*PermanentEmployee permanet = new PermanentEmployee(employeeId, employeeName, basicPay);
        TemporaryEmployee temporary = new TemporaryEmployee(employeeId, employeeName, hoursWorked, hourlyWages);
        */
    	PermanentEmployee permanet = new PermanentEmployee(101, "Ali", 20000.00);
        TemporaryEmployee temporary = new TemporaryEmployee(102, "Khan", 8, 1000);
        Loan loan = new Loan();
        double permanentLoan = loan.calculateLoanAmount(permanet);
        double tempararyLoan = loan.calculateLoanAmount(temporary);
        
        System.out.println(permanentLoan);
        System.out.println(tempararyLoan);
    }
    
}