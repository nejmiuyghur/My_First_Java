package day_12;

public class Swtch_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		swtich stament like multibranch if ...
		1- it gave switch expression{
		
		case casevale:
		statment1
		staement2
		
		}
		*/
		
		
		
		
		int score =2;
		if (score ==1) {
			
			System.out.println("1");
		}
		else if (score ==2) {
			System.out.println("2");
		}
		switch (score) {                               // in switch staement you will give expression: data 
		case 1:
			System.out.println("1");
		break;
		
		case 2:
			System.out.println("2");
		
			break;
		default:
			
			System.out.println("Invalid");
			
			// if there is no break in swicth statment, then case will be continue. 
		}
			
		String	str = "Java";
		
		switch (str) {
		default :
			System.out.println("Invalide");
		
		case "C#":
			
		case "pYTHON":
				
		System.out.println(" languages..");
		
		case "Java":
			System.out.println(" you are the greatest person ");
		
		break;
		}
		
		
		char gread= 'A'; 
		switch (gread) {
		case 'a':
			System.out.println(" Passed with B");
		
		case 'A':
			System.out.println("Passed with a");
			
			
			default:
				System.out.println("Passed");
				
				// only break statement 
				
				
				
		}
		
		
		}
		
		
		
	
	}

