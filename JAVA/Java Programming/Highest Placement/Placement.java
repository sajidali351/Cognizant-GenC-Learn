import java.util.*;

public class Placement{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no of students placed in CSE:");
    int cse = sc.nextInt();
    
    System.out.print("Enter the no of students placed in ECE:");
    int ece = sc.nextInt();

    System.out.print("Enter the no of students placed in MECH:");
    int mech = sc.nextInt();
    
    if (cse<0 || ece<0 || mech<0){
        System.out.println("Input is Invalid ");
    }
    else if (cse==ece && cse==mech){
        System.out.println("None of the department has got the highest placement");
    }
    else if (cse>ece && cse>mech){
        System.out.println("Highest placement");
        System.out.println("CSE");
    }
    else if (ece>cse && ece>mech){
        System.out.println("Highest placement");
        System.out.println("ECE");
    }
    else if (mech>cse && mech>ece){
        System.out.println("Highest placement");
        System.out.println("MECH");
    }
    else if (cse==ece){
        System.out.println("Highest placement");
        System.out.println("CSE");
        System.out.println("ECE");
    }
    else if (cse==mech){
        System.out.println("Highest placement");
        System.out.println("CSE");
        System.out.println("MECH");
    }
    else if (ece==mech){
        System.out.println("Highest placement");
        System.out.println("MECH");
        System.out.println("ECE");
    }
    
 }  
}