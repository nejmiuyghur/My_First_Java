package day20;

public class warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     /*
      find words from sentence. 
      i like book, i love book,,,, 4 book. 
      
      first i need to let loop cheak every words. 
      
    
      */
	
		String sentence= "I have book, I love book , i read book, i buy book.";
		
		int count = 0;

		for (int z=0; z <sentence.length()-3;z++) {
	     if (sentence.substring(z, z+4).equals("book")) {
	    	 count++;
	    	 
	     }
		}
		
	    	 int nTime=0;
	    	 String words= "Cybertek is a school, Cybertek is good,  is big Cybertek";
	    	 
	    	 for (int i=0; i<words.length(); i++) {
	    	 
	    	 if (words.substring(i,i+8).equals("Cybertek")){
	    		 
	    		 nTime++;
	    		System.out.println(nTime);
	    	 }
	    	 }
	    	 
	    	 
	    	 /*
	    	  remove the duplicate 
	    	  
	    	  */
	    	 
	    		 
	    		 
	    	 
	    	 
	    	String s1="aabbcc";
	    	String result = "" ;   //abc
	    //abc
	    	
	    	for (int n =0;n<s1.length();n++) {
	    		if (!result.contains(s1.substring(n,n+1))){
	    		
	    			result+= s1.substring(1, n+1);
	    	}
	    	
	    	}
                
	    	System.out.println(result);
	    	
	    	
	    	String s2 = " book book";
            String result1 = "";    
	    	for (int n =0;n<s2.length();n++) {
    	    		if (!result1.contains("" +s2.charAt(n))){
    	    		
    	    			result1+= s2.substring(1, n+1);
    	    			
    	    	}
    	    	
    	    	}
    			System.out.println(result);


	     
}	
	}

