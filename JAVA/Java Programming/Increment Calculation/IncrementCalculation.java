import java.util.Scanner;

public class IncrementCalculation{
    public static void main(String args[]){
        incrementfun();
        
    }
    
    public static void incrementfun(){
        int increment;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int sal = sc.nextInt();
        
        System.out.println("Enter the Performance appraisal rating");
        double rating = sc.nextDouble();
        
        if(sal<=0 || rating<1 || rating>5){
            System.out.println("Invalid Input");
            return;
        }
        if(sal>0){
        if(rating<=3.0){
            increment = (int)(sal+sal*.1);
            System.out.println(increment);
        }
        else if(rating<=4.0){
            increment = (int)(sal+sal*.25);
             System.out.println(increment);
        }
        else if(rating<=5.0){
            increment = (int)(sal+sal*.3);
             System.out.println(increment);
        }
        } 
    }
}