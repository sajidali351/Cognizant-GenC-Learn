import java.util.Scanner;
import java.text.*;
public class Main{
    public static void main(String args[]){
        float fuel_Gl, distance_Mi, result_L, result_M;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        int fuel_Lt = sc.nextInt();
        if (fuel_Lt <=0){
            System.out.println(fuel_Lt + " is an Invalid Input");
        
            return;
        }
        
	    System.out.println("Enter the distance covered");
        int distance_Km = sc.nextInt();
        if (distance_Km <= 0){
            System.out.println(distance_Km + " is an Invalid Input");
            return;
	    }
	    
        if (fuel_Lt > 0 && distance_Km > 0){
            
            DecimalFormat decimal_format = new DecimalFormat("0.00");
            System.out.println("Liters/100KM");
            result_L = (float)fuel_Lt / (float)distance_Km * 100.0f;
            System.out.println(decimal_format.format(result_L));
            
            System.out.println("Miles/gallons");
            distance_Mi = (float)(distance_Km * 0.6214);
            fuel_Gl = (float)(fuel_Lt * 0.2642);
            result_M = (float)(distance_Mi / fuel_Gl);
            System.out.println(decimal_format.format(result_M));
        }
	 
        
        
       
    }
}