import java.util.*;
public class Main{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     
     // Fill the code here
      int n = sc.nextInt();
      int discountAmt = 0;
      int [] discounts = new int[n];
      String products[]=new String[n];
      
     // int idx= -1;
      for(int i = 0; i<n; i++){
          String input [] = sc.next().split(",");
          String name = input[0];
          int price = Integer.parseInt(input[1]);
          int discount = Integer.parseInt(input[2]);
          discountAmt = (price * discount) / 100;
          discounts[i] = discountAmt;
          products[i]=name;
          
      }
      int minDiscount = discounts[0];
      for(int i = 0; i<n; i++){
          if(minDiscount>discounts[i]){
              minDiscount=discounts[i];
             // idx=i;
          }
          if(minDiscount ==discounts[i]){
            System.out.println(products[i]);
          }
      }
      
    }
}