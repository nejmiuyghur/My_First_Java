package myJAVA;

public class ifstatment {

	
	
	public  static void main (String[] args) {
	
	

		
		int gread = 90;
		int gread1 = 80;
		int gread2 = 90;
		
		if (gread >=60 && gread <= 100  ) {
			
			
			System.out.println( " you have passed");
		
		
	if (gread >=60 &&  gread <= 69) {
	
	
        System.out.println("You have passed with CC");
	}
		
		if (gread1 > 80  && gread <89) 
	
			System.out.println(" you have passed with bb");
		}
		
			if (gread2 >= 90 && gread <95) {
				System.out.println("You have passed with AA");
		}
		
			int greada = 90;
			
			
			
			boolean A = greada>=90 && greada <=100;
			boolean B = greada>=80 && greada <= 89;
			boolean C = greada>= 70 && greada <= 79;
			boolean D = greada>60 && greada <=69;
			boolean ValidGread = greada> 0 && greada <101;
		
			
			if (ValidGread) {
			
		    if (A) {
			System.out.println("You got AA");
			
		}
			else if  (B) {
        System.out.println("You have got BB");		
			}
			else if (C) {
			System.out.println("You have got CC");	
		}
			
			else if (D) {
				System.out.println("You have got DD");
			}
			
			else { 
					System.out.println(" You have failed");
				}
			
		
		    if (90>80) {
			System.out.println(" You have failed");
	
		}
				}
			
		
	}
	
}
			
			
	
		
		
	
	

	

