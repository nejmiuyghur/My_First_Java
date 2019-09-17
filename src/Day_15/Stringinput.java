package Day_15;

import java.util.Scanner;

public class Stringinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Enter you first name");
		String firstname=scan.next();
		
		System.out.println("Enter your last name");
		String lastname=scan.nextLine();
		
		System.out.println("first name is " + firstname);
		System.out.println("last name is " + lastname);

		
	}

}
