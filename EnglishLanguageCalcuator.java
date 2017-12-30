package Chap5;

import java.util.Scanner;



public class EnglishLanguageCalcuator {
	
	public static void main(String[] args) {
	int a = 0;
	int b = 0;
	Scanner scan = new Scanner(System.in);
	String operator = null;
	//variable to tell the user to exit
	


    	
    	System.out.println("Welcome to English Langauge Calculator Program"
    			+ " wich can calculate two numbers you want to choose. ");
    	System.out.println("Please type your first number that you want to calculate");
    	a = scan.nextInt();
    	
    	System.out.println("Now type the second number");
    	b = scan.nextInt();
    	
    	System.out.println("Here are the operators that you can use to manipulate "
    			+ "the numbers.");
    	
   
    	
    	
    	
		
    	
		System.out.println("Addition, Substraction, Multiply, Divide, Module, Expoential ");
    	System.out.println("Please select one");
    	operator = scan.next();
        operator = operator.toUpperCase();
        
   
        switch (operator) {
        case "ADDITION":
        	int c = a+b;
        	
              System.out.println("You've chosen to add your numbers");
              System.out.println(a +" will be added by " +b  
            		  + " which is equals to " +c);
              break;
        case "SUBRACTION":
        	 
 
        		
              System.out.println("You've chosen item #2");
              // do something...
              break;
        case "MULTIPLY":
        	 int d = a*b;
        	 System.out.println("You've chosen to multiply your numbers");
             System.out.println(a +" will be added by " +b  
           		  + " which is equals to " +d);
           
              break;
              
        case "DIVIDE":
        	 int e = a/b;
        	 System.out.println("You've chosen to divide your numbers");
             System.out.println(a +" will be divided by " +b  
           		  + " which is equals to " +e);
             if(b == 0)
             {
            	System.out.println("Sorry your denominator was a zero and nothing "
            			+ "cannot be divded by zero");
             }
            	 
            	 
             
              break;
        case "MODULE":
        	 int f = a%b;
        	 System.out.println("You've chosen to calculate your numbers by using module");
             System.out.println("Your answer is " +f);  
              break;
        case "EXPOENTIAL":
        	 double g = Math.pow(a, b);
              System.out.println("You Have Choosen Expoential");
              System.out.println(+ a +"is to the power of " +b +" is " +g);              
              break;
        default:
            System.out.println("Invalid operator.");
          
 
        }
        
        System.out.println("Thank you for using the Christian's shitty ass calculator. ");
 
       
  }
}

	
	

