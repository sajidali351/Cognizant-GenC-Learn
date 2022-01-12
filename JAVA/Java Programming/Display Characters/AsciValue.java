import java.util.Scanner;

public class AsciValue{
    public static void main(String args[]){
    
    input();
    
     
    }
    
    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int digit;
        for(int i = 1; i<=4; i++){
            digit = sc.nextInt(); 
            System.out.println(digit+ "-"+ (char)digit);
        }
       
    }

}