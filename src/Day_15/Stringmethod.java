package Day_15;

public class Stringmethod {

	public static void main(String[] args) {

		
		                 String str =  "Cybertek";
		// they all have index number-  01234567
		 // if I want to find the index number 
		                 //charAt(index):
		                 System.out.println(str.charAt(5));
		                 
		                 char ch = str.charAt(4);
		                 System.out.println(ch);
		                 // it take index number and return as char 
		                  
		                 String str2 = "Mu htar";
		               // index number   0123456
		                 System.out.println(str2.charAt(3));
		                 
		                 
		       System.out.println("Enter Char value");                
		      /*length(): returns the total number of characters as int value 
		     */
	
		       String name ="Donald J Trump";
		      int n= name.length();
		       System.out.println(n);
		       
	
	          // concat(): it used for concat two string together.
		       
		       String s1 = "Cybertek ";
		       
		             s1.concat("School"); // string is immutible( unchangeble) that why it call Cybertek.	             
	       // only way to modfy(change is to assign it)    then it will return a new String value   
		             s1=s1.concat(" School");
	                
		             // 
		             System.out.println(s1);
	                 
		             // new. to upperCase():
		           
		             String N= "raziye";
		            // N.toUpperCase();
		             
		             N.toUpperCase();

		             N = N.toUpperCase();

		             System.out.println(N);
		             
		             
		             //toloweCase 
		             
		             
		             
		             // index
		             
		             
		             /*   charAt(index), length, concate (Str), toUpperCase(),
		              * 
		              *///a=a.charAt(index)
		           
		             String m = " Aksu Kalpun Sehiri";
		             m.charAt(11);
		             System.out.println(m.charAt(11));
		           
		             
		             char ch1 =m.charAt(12);
		             System.out.println(ch1);
		            
		          int length =m.length();
		          System.out.println(length);	  
		          
		          m = m.concat(" eng cong seher");
		          System.out.println(m);
		          
		         m= m.toUpperCase();
		          System.out.println(m);
		          
		          
		          
		           // int HighestIndexNum= 
		             
	             String d = "book";
	             d.toUpperCase();
	             
	             d=d.toUpperCase();
	             System.out.println(d.toUpperCase()); //BOOK
	             
	             System.out.println(d);//book
	                
	             
	             String e = "JAVA IS FUN";
	             e.toLowerCase();
	             System.out.println(e);
	             e=e.toLowerCase();
	             System.out.println(e);
	
	}
 

}
