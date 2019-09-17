package Day17_Stringclass;

import java.util.Scanner;

public class warmup_2 {

	public static void main(String[] args) {
		
		/*
		 uMuHTAR      user proboably enter this way.
		 uCYebertek         if user enter like this .
		 
		 what ever input---first letter should be in capital remining is lowercase. 
		 */
	       
		
		      Scanner scan = new Scanner(System.in);
		
		      System.out.println("Enter your first Name");
		      String firstName= scan.nextLine();
		
		      firstName = firstName.substring(0).toUpperCase()+firstName.
		    		  substring(1).toLowerCase();
		       
		           
		      
		      String LastName = scan.nextLine();
		      
		      LastName=  LastName.substring(0,1).toLowerCase()
		    		  +LastName.substring(0,1).toUpperCase();
		     
		  
		     System.out.println(firstName);

		     System.out.println(LastName);
		         
		         
		        
		
	          
		
		
	
		
		
		
		
		
		
		
	} 

}
