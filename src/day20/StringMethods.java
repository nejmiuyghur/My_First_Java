package day20;

public class StringMethods {

	public static void main (String[]args) {
		
		
		/*
		 substring, indexOf,  last 
		  
		  
		 
		 * 
		 */
		String str ="Cybertek School";  // subString: creating the 
		   str =str.substring(0, str.indexOf("k")+1);   // sub value of the String ending index is excluded.
		
		System.out.println(str);
	           String str2= "Cybertek school";;
	        str2= str2.substring(str2.indexOf("s"));
	
	        System.out.println(str2);
	        
	        // index of:
	         String s1 ="Java is fun language, i love java is good java";
	         
	         
	         System.out.println(s1.indexOf("a"));
	        
	         System.out.println(s1.indexOf("ag"));
	         
	         
	        // lastIndexOf ();  returns the last occured char's index num.
	         
	         
	         System.out.println(s1.lastIndexOf("ava"));
	        
	         
	       //  replace: replaces the old value with the new one. 
	         
	         String name= "Cybertek School Batch 12";
	         int length = name.length();
	         System.out.println(length);
	         
	         name= name.replace("","" );
	         System.out.println(name.length());
	         
	         name = name.replace("e", "b");
	         System.out.println(name);
	       
	         
	         //replaceFirst: replace the first occured old character with the new one
	         
	         String A1= "Java is Fun, Java is object oriented";
	         
	        // A1 = A1.replace("Java","+--");
	         //System.out.println(A1);

	         A1= A1.replaceFirst("Java", "+11");
	         System.out.println(A1);
	        
	         
	         /*  ==, equals, equalIgnoreCase
	         
	          */
	         String R1="Cybertek";
	         String R2= "cybertek";
	         String R3 = new String ("Cybertek");
	         System.out.println(R1==R2);
	         
	         System.out.println(R1.equals(R3));
	         
	         System.out.println(R1.equalsIgnoreCase(R2)&& R1.equalsIgnoreCase(R3));

	
	                  // char at 
	
	     String num2= "my name is najmidin from AKSU kalpun that is the greates place";
	     
	    System.out.println(num2.charAt(num2.lastIndexOf("g"))+1);
	    		
	    //last and first index character
	    String str3 = "AGFAKFJDKSHFKDSHFKJDSHK";
	    System.out.println(str3.charAt(0));
	    System.out.println(str3.charAt(str3.length()-1));
	    
	    S
	    
	    
	    
	    
	}
	
	
	
	
}
