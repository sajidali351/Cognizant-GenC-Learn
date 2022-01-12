import java.util.*;
public class EMICalculator {
	
	public double calculateEMI(double principal,String loanType,double durationInYears)
	{
		double rate=0.0;
		double loanAmount=0.0;
	   if((principal>=10000) && (durationInYears>0 && durationInYears<=20)) {
	   if(loanType.equals("Housing Loan"))
	   {
		   rate = 0.12;
		   rate=rate/(12*100); 
	       durationInYears = durationInYears*12; 
	       loanAmount = (principal*rate*Math.pow(1+rate,durationInYears))/(Math.pow(1+rate,durationInYears)-1);
	       
	   }
	   else if(loanType.equals("Vehicle Loan"))
	   {
		   rate = 0.11;
		   rate=rate/(12*100); 
	       durationInYears = durationInYears*12; 
	       loanAmount = (principal*rate*Math.pow(1+rate,durationInYears))/(Math.pow(1+rate,durationInYears)-1);
	     
	   }
	   if(loanType.equals("Personal Loan"))
	   {
		   rate = 0.10;
		   rate=rate/(12*100); 
	       durationInYears = durationInYears*12; 
	       loanAmount = (principal*rate*Math.pow(1+rate,durationInYears))/(Math.pow(1+rate,durationInYears)-1);
	       
	   }
	   }
	   return loanAmount;
	}
	}