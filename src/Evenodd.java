import java.util.Scanner;

public class Evenodd {

	
	 public static void main(String[] args) {
		  
		    System.out.println("Enter the number");
		    Scanner x=new Scanner(System.in);
			int i=x.nextInt();
			validate(i);
	  }
	 static void validate(int num){
		 
	    if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");
	  }
	}

