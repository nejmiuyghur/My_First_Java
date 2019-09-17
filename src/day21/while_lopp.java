package day21;

import java.util.Scanner;

public class while_lopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/* for loop: for(initialization; condition; interation){     }
		while loop: only excuted as long as condition is true. 
		 wile (condition){ statement;}  
		 it is like if statemtn. if is only one, while loop reapiting
		  as long as condition is true. 
		*/
		
		int a =9;
		while (a>8) { // it decrase the value of a.
	     System.out.println("Hello"+a);
	     a--; 
	}
		
		String sentence ="I like book, I read book, book, book, book";
		int count =0;
		while (sentence.contains ("book")) {
		count++;
		sentence =sentence.replaceFirst("book", "");
		}
		System.out.println(count);
		System.out.println(sentence);
		
		/* Break statement:
		 exist the switch staement and loop. 
		 forcefully exist the loop. 
		
		 */
		while (true) {
			System.out.println("Hello");
			break; // forcefully exits the loop.
		
		}
	     
		int i= 0;     //**declaration must be outsiede of the loop because it repate many times. 

		while (true) {
			i++;
			System.out.println("Hello:"+i);
	       if (i==5) {
	    	   break;
	   }
	   }
		
		
		for (int z=1; z<=100; z++) {
		if (z %2==0) {
		System.out.println(z+"");
		
		}
		}
		
	int x =1; 
	while (x<=100) {
    if (x%2 == 0 ) {
	System.out.println(x+"");
	}
	}
	     System.out.println();
	
	
	      Scanner scan = new Scanner(System.in);
	       System.out.println("Starting number");
	       int start = scan.nextInt ();
	       
	       System.out.println("ending number");
	       int end = scan.nextInt();
	     for (int j = start; j<=end; j++) {
	    	 if (j %2==0) {
	    		 System.out.println(j+"");
	    	 }
	         }
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		}

