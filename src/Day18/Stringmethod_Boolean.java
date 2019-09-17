package Day18;

    public class Stringmethod_Boolean {
     public static void main(String[]args) {
    	 
    	 
    	 /*
	      isEmpty(); : this method cheaks if the string is empty. it retunr
	      boolean expession.
	    
	      */
	
	              String str= "Cybertek";
	               boolean R1= str.isEmpty();
	               System.out.println(R1);
	
	               
	               String str2="z ";
	               if (str2.isEmpty()) {
	            	   
	            	   System.out.println("it is empty");

	               }else {
	            	   System.out.println("is not empty ");
	               }
	            	   
	
	               
	               
	               String A1= "Cybertek";
	               String A2= new String("Cybertek");
	
	                //System.out.println(A1==A2);
	
	                // or you can use .equals();
	                boolean R2= A1.equals(A2);
	                
	                
	                System.out.println("Cybertek".equals("cybertek"));
	                
	                // Java is a case sesitivity
	                
	                
	                String S1 ="JAVA";
	                String S2 = new String ("java");
	                // now they are difference because of letter, ... now false
	                
	                System.out.println(S1.equals(S2)); // still false, because different letter.
	                
	                System.out.println(S1.equalsIgnoreCase(S2)); //this dont care sensitivity
	                
	                
	                /*
	                  contains(str): cheks if the str is contained in the String or not, 
	                  then returns boolean expression. contain==true   ! contain= false
	                */
	                
	                String name= "Muhtar";
	                boolean result = name.contains("good");  //false 
	                System.out.println(result);
	                
	                String name2 ="MarufJon";
	                System.out.println(name2.contains("1"));
	                
	                
	                
	                
	                /* startWith("str"): this cheks if the String is started with str or not
	                 then returns boolean expression.
                    
                        if this startedwith== true       !startedwith==false
                        
                        */
	                
	                String Today= "Java";
	                
	                   boolean Result= Today.startsWith("J");
	                   
	                   System.out.println(Result);
	                  
	                   String names ="Cybertek school is a great place";
	                
	                System.out.println(names.startsWith("Cybertek"));

                       
	                /*endsWith(str);  : if the string ended with given str or not, then returns 
	          boolean expressions.      endedwith == true       !endedwith == false
	                
                                    */
                  String B1= "Muhtar is a teacher";
                 
                  System.out.println(B1.endsWith("eacher"));
                  
                  System.out.println("");
	                
	                
	                
	                
	                
	                
	                
     }



}
