package day14_scanner;

import java.util.Scanner;

/*
 import statment can be used between package and class. 
 */
 

public class scannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Scanner: it is a class that provides that methods to get user inputs
	scanner class presented in the package called "java.util" package. this package contain some java unitility
	in order to use scanner class, the scanner class MUST be imported :(import) this important,
	import java. util.Scanner;
	
	the import statement MUST be placed between package and className.
	
	
		 */
/*
		decleration of Scanner: 
		Scanner VaribleName= new Scanner(Sysytem,in);
		VaribleName:can reference and object of the scanner class
		new Scanner (Sysytem. in) : creates the object of the scanner class. 
		
	*/	
             /* methods of canner class:
              varibleName. NextByte():
              allows user to enter Byte valuse
               
               */
		
		
	Scanner input = new Scanner (System.in);
	 System.out.println("Enter a Byte Valuse 1");
	 byte ByteNum = input.nextByte();
		
	 System.out.println("You have enterd: " +ByteNum);
	
	 System.out.println("Enter a Byte Value 2");
	 byte byteNum2 = input.nextByte();
	 System.out.println("You have entered:" +byteNum2 );
	 
	
	 System.out.println("addition is:" +(byteNum2+ByteNum));
	 
	 
	 /*
	   how do we dind addtion
	  */
	
	
	 byte steps = 100; 
	    short miles = 500;
	    int count =1000000;
	    long population = 3434455667l;
	 
	    Scanner scan = new Scanner(System.in);
	    
	    String call = "Calling number";

	    int areaCode =scan.nextInt(),
	    	      localNumber =scan.nextInt();
	    System.out.println(call+ "\n"  +"("+ areaCode+")"+ "(" +localNumber +")");
	 
	   
 
	
	}
	

}
