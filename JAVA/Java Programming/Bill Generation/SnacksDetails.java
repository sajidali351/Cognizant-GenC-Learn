import java.util.Scanner;

public class SnacksDetails{
    public static void main(String args[]){
        bill();
        
    }
    public static void bill(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no of pizzas bought:");
        int pizza = sc.nextInt();
        
        System.out.print("Enter the no of puffs bought:");
        int puffs = sc.nextInt();
        
        System.out.print("Enter the no of cool drinks bought:");
        int drink = sc.nextInt();
        
        int bill_Amount;
        bill_Amount = pizza * 100 + puffs*20 + drink*10;
        
        System.out.println("Bill Details");
        System.out.println("No of pizzas:" + pizza);
        System.out.println("No of puffs:" + puffs);
        System.out.println("No of cooldrinks:" + drink);
        System.out.println("Total price=" + bill_Amount);
        System.out.println("ENJOY THE SHOW!!!");
        
    }
}