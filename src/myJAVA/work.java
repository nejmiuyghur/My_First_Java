package myJAVA;

import java.util.Scanner;

public class work {
 public static void main( String[]  args){
	 
	 
	  int num1,num2,num3,sum;
	 	Scanner scan = new Scanner (System.in);
	System.out.println("Enter 3 numbers:");
		num1 = scan.nextInt();
		 num2 = scan.nextInt();
	num3 = scan.nextInt();
	sum=num1+num2+num3;
	System.out.println("Sum of numbers: "+ sum );
	 
	int grade = 60;
	
	
    int n1 = 1;
    int n2 = 2;
    int n3 = 3;
	          if(n1>n2){
		    System.out.println(" n1 is bigger"); 
		    }else if (n2>n3){
		    System.out.println("n2 is bigger");
		    }else{
		    System.out.println("n3 is bigger");
		    
		    
		    Scanner s = new Scanner(System.in);
		    String txt = s.next();
		    //your code here
		    System.out.print(txt.charAt(2)+""+txt.charAt(4)+""+txt.charAt(5) );
		      
		    System.out.print(txt.charAt(5));
		    
		    }
 }
 


}
