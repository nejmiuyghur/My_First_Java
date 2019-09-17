package day_12;

public class warm_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		

		
		//nastedif
		
		int A= 10, B = 20, C = 30;
		
		if (A==B && B==C) {
			System.out.println("All equal");
		}
		else {  // if previous is not right then the below are (else started to workd)
			
			if (A==B){
				System.out.println("A equal B");
			}
			else if (B==C){
				
				System.out.println("B and C are equal");
			}
				else if (A==C) {
			System.out.println( " A equal to C");	
			}
				else if (A<B) {
					System.out.println("A SMALLET THAN B");
				}
		
				else if (C>B) {
					System.out.println("C bigger than b");
				}
				else {
					
					System.out.println(" nothing");
				}
			
			int M=20, N=21, L= 23, K=25;
			
			if (M<N) {
		System.out.println("You are soo good");
		
	}
			
		if (N< L) {
		System.out.println("you are bad ");
		}
		
		if (K>L) {
			System.out.println("YOU ARE RIGHT");
			System.out.println("soooo");
			System.out.println("hello");
		System.out.println("world");
		}
		
		if (true)
		if (1>2)
			System.out.println("money11");
		else  
			System.out.println("no money");
		else
		   System.out.println("invalide");
			
	int grade=80;
	
	if (grade >= 90)
		System.out.println("A");
	
	 if (grade >=80) System.out.println("B");
	 if (grade >=70) System.out.println("C");
		
		}
	}

}
