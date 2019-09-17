import java.util.Scanner;

public class Day19_warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	   Scanner scan = new Scanner(System.in);
	System.out.println("Enter user Name");
	   String user= scan.nextLine();
	   
	   System.out.println("Enter pass");
	   String pass = scan.nextLine();
	   
	   String userName = "urhunboy@gmail.com";
	   String passWord = "najmidin54";
	   	  
	   	  
	   if (user.endsWith("@gmail")|| user.endsWith("@GMAIL")  ){
		   
	   
	   if (user.equalsIgnoreCase(userName)&& pass.equals(passWord)){
		   	     System.out.println("logIn succesess");
	   }else { 
	  
	   System.out.println("it is not valide email");
	   }
	   
	   System.out.println("invalid gmail");
	   
	   
	   }
	   }
	   }

