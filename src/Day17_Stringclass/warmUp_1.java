package Day17_Stringclass;

import java.util.Scanner;

import day14_scanner.scanner_Class;
import myJAVA.java;

public class warmUp_1 {
	
	
	
	public static void main (String[]args){
		
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter you first and last name");
		
		String firstName = input.next();
		
		
		String LastName = input.nextLine();
		/*String initials = firstName.substring(1)+ LastName.substring(5);
	*/	
		//System.out.println("initial is :" firstName);
		
     
		
	//	firstName = firstName.toUpperCase(5);
		System.out.println("Initials is: initials ");
		
		String initials= ""+ firstName.charAt(5)+LastName.charAt(4);
		
		
		
		
		
		
		// TODO Auto-generated method stub

		
		
		
		
				Scanner str = new Scanner(System.in);
			           
				System.out.println("Enter you first name");
				        String LastNamee =str.nextLine();
			           System.out.println("enter you last name: ");
			            String FirstName =str.nextLine();
			         
			           int FirstNamee = FirstName.length()-1;
			          
			           int LastNameee = LastName.length()-1;
			           
			           String lastName =" " +FirstName.charAt(10)+
			        		   "."+ LastNamee.charAt(5);
			          
			           String LastLetter = lastName.substring(5)+ LastName.substring(3);
		
		
		
		
			           
			        
	
	}
	
	

}
