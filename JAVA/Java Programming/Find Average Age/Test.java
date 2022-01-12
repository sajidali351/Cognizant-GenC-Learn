import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
        System.out.println("Enter total no.of employees:");
        int noOfEmployee = sc.nextInt();
        
        if (noOfEmployee <= 1){
            System.out.println("Please enter a valid employee count");
            return;
        }
        int [] employees = new int[noOfEmployee];
        System.out.println("Enter the age for "+ noOfEmployee + " employees:");
        for(int i = 0; i < noOfEmployee; i++){
            int emp = sc.nextInt();
            if (emp >= 28 && emp <= 40){
                employees[i] = emp;
                
            }else{
                System.out.println("Invalid age encountered!");
                return;
            }
            
        }
        for(int i = 0; i<noOfEmployee; i++){
            total = total + employees[i];
        }
        System.out.println(String.format("The average age is %.2f", (double)total/noOfEmployee));
    }
}