import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Flight flightObj = new Flight(100, "NYC", "USA", 100, 100.0);
        FlightManagementSystem flightManagementSystem = new FlightManagementSystem();
        boolean isFlightAdd = flightManagementSystem.addFlight(flightObj);
        
        if(isFlightAdd) {
        	System.out.println("Flight details are added successfully");
        }
        else {
        	System.out.println("Not Added");
        }
    }
}