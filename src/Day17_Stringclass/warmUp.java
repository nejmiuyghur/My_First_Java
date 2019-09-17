package Day17_Stringclass;

import java.util.Scanner;


public class warmUp {
	
	public static void main(String[]args) {

		
		Scanner scan = new Scanner(System.in); // it needs to be imported.
		 
		System.out.println("Enter your first name and last name");
		 
		String firstName = scan.nextLine();
        String lastName = scan.nextLine();		
		
        String  fullName = firstName.concat(" " +lastName);  // after concat value you can only give space value.
                 int num =   fullName.length();
		
		System.out.println(fullName+" "+"contains" + num + "characters");
		
		int lastIndexNum = fullName.lenght()-1; 
		System.out.println(fullName.charAt(fullName.length));
		
		
		
		scan.close(); // this is close scanner method. 
		
		
	}

    }
