package Day17_Stringclass;

public class StringMethod2 {

	public static void main(String[] args) {

		  /* replace (old char, new char);
        replaces all the char value with the given new cahr values and returns it as 
        NEW string values. 
        
       */
		
		    String str1 ="Java is Fun Programming languages";
		    str1= str1.replace('a' , 'e');
		       System.out.println(str1);		
		
		       
		       
		       String str2 = "Today is gonna be a great day learn Java";
		    		   str2 = str2.replace("Today", "Tommorow");
	                   System.out.println(str2);	       
	
	                   str2= str2.replace("Java", "");
	                   
	                  System.out.println(str2);
	                  
	               /* replaceFirst. it will only remove first occureed one. tunni korgan 
	                hatni yokitidu.
	                */
	
	                 
	                  String s1 = "Java is fun, java is good";
	                  s1= s1.replace("Java", "python");
	                  System.out.println(s1);
	                  		
	                  
	                  s1=s1.replaceFirst("is good", "iS Good");
	                 
	                  System.out.println(s1);
	                  
	                  
	                  String s2= "Java is programming languages, Java is Java";
	                  
	                  s2=s2.replaceFirst("Java is J", "C+ is j");
	                  System.out.println(s2);
	                  
	                  
	                  
	                  
	                  
	                  
	}

}
