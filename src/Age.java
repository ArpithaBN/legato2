import java.util.Scanner;

public class Age {
		  public static void main(String[] args) {
		  
		    System.out.println("Enter your Age");
		    Scanner x=new Scanner(System.in);
		    int age=x.nextInt();
		    
		    if(age>18){
		    	System.out.println("eligible");
		    }
		    else{
		    	System.out.println("not eligible");
		    }
	
		  }
}


