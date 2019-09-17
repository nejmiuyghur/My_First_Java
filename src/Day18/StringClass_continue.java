package Day18;

public class StringClass_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		/*
		 indexof method    
		 indexOf(String)(str) it returns the index number of the first
		  character in the given String as an int value.
		
		 */

		String A1 = "Batch 12 is great batch";  // it is so hard to count make it easy indexOf method
		
		    int num=  A1.indexOf("g");
		     System.out.println(num);
		
		String B1 = "Today is Tueasday, today we hav elcass in the afterniim";
		
		int num2 = B1.indexOf("today w");
		System.out.println(num2);
		
		String adress = "7925 Jones Branch Dr Mclaearn, VA 2003";
		int begin = adress.indexOf("Dr")+2;    //++ means it will give you more letter
		int end = adress.indexOf(", V");
		
		String cityName= adress.substring(begin,end);
		
		 System.out.println(cityName);
		 
		 
		 
		 String email = "Random.Emails@gmail.com";
		
		 int begin2= email.indexOf("@");
		 int end2 = email.indexOf("com");
		 String emailType = email.substring(begin2, end2);
		 System.out.println(emailType);
		
		String str = "ABCDABCD";
	     int n2 = str.indexOf("B");
	     System.out.println(n2);
	     
	     String myEmail="myEmail.school@hotemail.com";
	     
	     int Begin = myEmail.indexOf("@")+1;
	     int end1 = myEmail.lastIndexOf(".");
	     
	     
	     String MyEmailType = myEmail.substring(Begin, end1);
	     System.out.println(MyEmailType);

	     
	    
	     
	     
	}

}
