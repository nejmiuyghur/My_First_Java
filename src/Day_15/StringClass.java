package Day_15;

public class StringClass {

public static void main(String[]args) {
	
	
              // String class 
	
	/*
	 1. String is an objective 
	 there are two wayd to creat object from String class:
	 
	 
	 */
	
	   String str = "Cybertek";
       String A = "Cybertek";   
       String B = "Cybertek";
    		   
      System.out.println(A==B);
      
      
    	       String str2 = new String ("Cybertek");   
               System.out.println(str== str2);
               
               
              
    		   
              /* when the object creat by String literals, that object will->       
                 be saved in string pull. it will not accep "" duplicate.   
                 
                   */
               /* when the String object is created by using "new" keyword.
                 the object will be saced at java heap memory(not within the 
                
                1. String literals: 
                String str = " Cybertek"
                
                2. String str = new String (" Cybertek");
                
                ex- String str = new String (" Cybertek");
                
                */
                       String str3 = new String (" Cybertek");
                       
                       String str4 = new String (" Cybertek");    
                            System.out.println(str3!=str4);
                            
                            String str5="najmidin";
                            String str6= "najmidin"; 
          
                            System.out.println(str5 +str6);
                            
                            String str7 = new String ("najmidin");
                        
                            System.out.println(str + str2+A+B);
                            
                            
                            String a = "Beach12";
                            String b = "Beach12";
                            String c = "Beach12";
                            String d = "Beach12";
                            String g = "Beach12";
                        
                            String l = new String ("cybertek");
                            String m = new String ("cybertek");
                            System.out.println(a==b);

                            /* String is an object that represent sequences of characters:==>"ABCSDSAD" 
                             it has its own index number Starts from zero
                             example-- String str=  "Cybertek" 
                             index number            01234567
                          
                             */
                          /* 3. String is immutable:
                           once you declare it you cannot modify it 
                             String methods: 
                           */
                            
                            /* String method:
                             * charAt(indexnum):
                             
                             
                             */
                          /*  class Main {
                            	  public static void main(String[] args) {
                            	    //Type your code here 
                            	  
                            	    */
                            
                            	    System.out.println(    "^");
                            	     //System.out.println("/|\");
                            	     
                            	    
                            	    int num = 345;
                            	    double cost = 234.56;
                            	    System.out.println("345 234.56");
                            	    
                            	    int i = 5;
                            	    float f = 15;
                            	   
                            	    
                            	    //write your code here 
                            	     System.out.println("i="+i+" f="+f);
                            	    
                            	    
                            	    
                            	  }
                            	                            
                            
    }
	
    
