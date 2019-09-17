package day21;

import java.util.Scanner;

public class do_while_practice {

	public static void main(String[] args) {

		
		do {
          Scanner scan = new Scanner (System.in);
          System.out.println("enter the first number");
          
          int a = scan.nextInt();
          System.out.println("Enter your sceond number");
          
	     int b=scan.nextInt();
	    
	     System.out.println("addition is"+(a+b) );
	     
	     System.out.println("do you want to continu");
	     String answer = scan.next();
	     
	     if (answer.equalsIgnoreCase("no")) {
	    
	    	 break;
	     }
	     }	    
	while (true);
	
		}
	}

