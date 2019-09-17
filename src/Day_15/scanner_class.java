package Day_15;


    import java.util.Scanner;
     
     // import scanner class only
    //pc name    class

// import java.util.*;   // import all the classes from java.util 


      public class scanner_class {
	
	    public static void main(String []args) {
		
		/*
		 scanner allows you to enter input value...
		 it is from "java.util " 
		 
		 import java.util.Scanner
		            PC name 
		 */
	 
		/* scanner class is presented int he"Jva.util"package
	- in order to use scanner, we MUST import it from its package:    import java.util.Scanner;
	
	the important statement MUST be placed between class and package:
	package A;
	import jva.util Scanner;
	public class B {}
	
	- wild import:
	import java.util.*;
	// import all the calsses within "java util package"
	 */
	
		
		/* declaration of scanner;
		   Scanner variableName= new Scanner(sysytem. in)
		
		varibleName: can reference an object of scanner class
		
		 new Scanner(system.in )
		 */
		 
		/*Scanner input = new Scanner(System.in);
		input.nextByte();  
		byte num = input.nextByte();
		// we use this method because we want to more useble, reuseble.
		
		System.out.println(num*5);
		
		*/
	    	
	    	
	    	Scanner s = new Scanner (System.in);
		
	    	
	    	System.out.println("Enter seconds");
	    	int sec = s.nextlnt();
	    	int restSec = sec %60;
	        int 
	    	
	    	
	    	
	    	/*System.out.println("Enter int value");
		int num3= input.nextByte();
         
		System.out.println("Enter long valuse");
		long num4 = input.nextLong(); 
		
		
		System.out.println("Enter boolean value");
		boolean result = input.hasNext();
		
		System.out.println("Enter float value");
		float num5= input.nextFloat();
		
       System.out.println("Enter double value");
       double num6 = input.nextDouble();
       
       System.out.println("Enter your first name");
       String str=input.nextLine();
       
		// it return you byte value.
		
     	// VaribleName.nextByte():-- then it will give you varible na
     		
		
		int num9= input.nextByte();
*/
	
		
	}

}
