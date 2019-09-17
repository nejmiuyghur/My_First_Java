package Day17_Stringclass;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
    
		/* string is an object that represent charactes.. every time we declare the string 
		
		1. String is an object
		there are two ways we can create String class, object:
		1. String literals: 
		   String str = "Cybertek"
		
		
		 2. second way to create String class is by using new key words. 
		 "new" keyword:
		 String str=  new String ("Cybertek")
		
		 
		 what happen if we use string litrals= it will go to string pull.
		  Eexample= String myName = "Najmi"; it will go to pool.
		  
		   Java heap: a memory location where all the object will be saved at
	
	       String poll: is located in the Java heap memory, it is very special memory location 
	       for String leterals. 
	       every time if the String object is created by the String literals that object will be
	       saved at String pool.  one  memory locatio can be shared by multipol variables. 
	       
	       
	       Evrytime if the String object is created by suing "new" keyword, the object will be save 
	       in the heap memory. out side String pool.   
	       
	
	*/	
		
	
		          String str1 = "Hello javengers";
	              String str2 = "Hello javengers";
	              boolean R1 = str1 ==str2;
	              System.out.println(R1);
	              
	              
	              String str3 = new String ("Hello Javenger");
	              String str4 = new String ("Hello Javenger");
	              
	             boolean R2 = str3 == str4;
	             System.out.println(R2);
	             
	             
	             boolean R3 = str1 == str3 && str1== str4;
	             System.out.println(R3);
	            
	              /*** 
	               *Java equality: interview question: important. 
	               */
	             
	             //String class method
	             /*1. concat. 2.length, 3.charAt, 4. toUpperCase,
	             5.toLowerCase
	             */
	              
	             // Concat ( it takes str) and combine two string and it retursn as new string value 
	             
	             String a = "Cybertek";
	            		 a.concat("Shcool");   // it returns "Cybertek School"
	            		                       // string cnnot modify.
	             System.out.println(a);
	             
	             a = a.concat("School");
	             System.out.println(a);
	              
	             
	             String A = "hello", b="hello ";
	             System.out.println(a==b);
	
	             /*length 
	              this method is used for the doble number of the characters.
	            
	             String str ="Cybertek"
	             index number  01234567
	             
	                          
	             */
	             
	             String  LongNmae= "klhdfaskjhfldsjhfsdlkjfhsdkjfhalk";
	            int num = LongNmae.length();
	            System.out.println(num);
	            
	            
	            
	            
	            /* charAt method: 
	             */
	            String name1 = "Muhtar";
	         char ch = name1.charAt(5);
	         System.out.println(ch);
	             
	            /* toUpperCase();: convetrs the String value to Upper case,
	             and retursn as NEW string value. 
	              
	               toLowerCase();:convetrs the String value to lower case,
	             and retursn as NEW string value.
	             */
	             
	              String name2 ="Cybertek";
	              name2.toUpperCase();
	              
	              System.out.println(name2);
	              
	              name2 = name2.toUpperCase();
	              System.out.println(name2);
	             
	              String name3 = "NAJMIDIN OKYAY ";
	              name3.toLowerCase();
	              
	              System.out.println(name3);
	              
	              name3 = name3.toLowerCase();
	              System.out.println(name3);
	              
	              
	              
	              /*
	               Trim();  : what it does is, this is for removing unused spaces. 
	               and returns it as NEW String value.
	              
	               */
	              String s1 = "         my      name       is      najmidin          ";
	               s1.trim();
	              System.out.println(s1);
	              
	              s1 = s1.trim();
	              System.out.println(s1);
	              
	              String s3 = "   ";
	              System.out.println(s3);
	              
	              s3=s3.trim();
	               System.out.println(s3);
	
	 
	               
	               /*subStrim(): there are two types of it 
	                * 1. substring(beginning index): it creates sub value of the String
	                from the beginning index till the last index and returns it as
	                 NEW String value. 
	                * 
	                */
	                    
	               String Str = "Cybertek School";
	               //            0123456789
	                   Str = Str.substring(11);
	                  System.out.println(Str);
	
	              // when you use it. when you 
	
	
	               String Adress = " 34000 Mimarsinan Mahallesi, evliya hoca Sokak";
	                                // 0123456789      
	               String zipcode = Adress.substring(2);
	             System.out.println(zipcode);
	           
	             /* it will ask you first ask you 
	                first index number and then ending index num will be excluded
	               (ending idex num will be sxcluded)
	               then returns it as a NEW String value.
	               
	                */
	
	             String Name = "Hello Cybertek School";
	                      //    0123456789.........
	             Name= Name.substring(6, 13*3/4);
	             System.out.println(Name);
	            
	             
	             String fullName = "najmidin aila aksu";
	             String middleName = fullName.substring(9,13);
	             System.out.println(middleName);
	             
	             
	             
	             
	             
	             
	             String str = "Batch 12";

	             int Z = str.trim().length();

	              

	            System.out.println(Z);
	           
	             
	           for (int i = 0; i < args.length; i++) {
		
	}
	}
	             
	
	                  

}
