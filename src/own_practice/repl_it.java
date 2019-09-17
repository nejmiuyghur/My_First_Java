package own_practice;

import java.util.Scanner;

public class repl_it {

	
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    
	    
	    //YOUR CODE HERE
	    if ( word1.length() != word2.length()){
	    System.out.println("cannot merge");
	  }else{
	    for(int x=0; x < word1.length() ; x++){
	      System.out.print(word1.charAt(x)+""+word2.charAt(x));
	    }
	  }  
		
		
		
	}
}
