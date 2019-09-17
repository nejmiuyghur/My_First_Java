package myJAVA;

public class ifclass {
	
	
	
 public  static void main (String[]args) {
	 
	
	 
	 int grade = 70;
		
		if( grade >= 60 && grade <= 100) {
			System.out.println("you passed");
			
			if( grade >=90 && grade <= 100) {
				System.out.println("\twith a grade of A");
				
			} 
			else if(grade >=80 && grade < 90) {
				System.out.println("\twith a grade of B");
			}
			else if(grade >= 70 && grade < 80) {
				System.out.println("\twith a grade of C");
			}
			else {  // 60 <= grade < 70
				System.out.println("\t with a grade of D");
	 
			}
	 
	
			
			 
		}
 }
 
	}
 

