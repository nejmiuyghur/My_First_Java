package day14_scanner;

public class warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int n = 5;
		String result2 = (n==9) ? "nine" : (n==8)? "eight" 
				 :(n==7)?"seven":(n==6)?"six"
			     :(n==5)?"five" :(n==4)?"four"
			     :(n==3)?"three":(n==2)? "two"
				 :(n==1)? "one" :(n==0)? "zero":"invalid";
		System.out.println(result2);
						 
	}

}
