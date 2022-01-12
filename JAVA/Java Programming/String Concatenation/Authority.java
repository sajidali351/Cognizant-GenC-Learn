import java.util.Scanner;

public class Authority{
    public static void main(String args[]){
        Concat();
    }
    public static void Concat(){
        Scanner sc = new Scanner(System.in);
        String U_resident, Uf_name;
        
        System.out.print("Inmate's name:");
        String name = sc.nextLine();
        
         System.out.print("Inmate's father's name:");
         String fname = sc.nextLine();
         
         name = name.concat(" ").concat(fname);
         char []chars = name.toCharArray();
         
         for(char c:chars){
             if(Character.isDigit(c) || c=='+' || c=='!' || c=='@' || c=='#' || c=='%' || c=='$' || c=='^'){
                 System.out.println("Invalid name");
                 return;
             }
         }
        System.out.println(name.toUpperCase());
       
    }
}