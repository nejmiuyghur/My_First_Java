package day20;

import java.util.Scanner;

public class warmup_4 {


   public static void main (String[]args) {
	   
	   
   Scanner scan = new Scanner (System.in);
   
    int min = 99999999;                        
    for (int i=1; i<=5; i++ ) {                   
    System.out.println("Enter a number" );  // i need user to give me a number, 
    int inputNum= scan.nextInt();            // how many time? is five 5 time.
    
    if (inputNum<min) {                            
    	min=inputNum;
    
     }     
    
	   
   }
    
    
    
    
   }



}
