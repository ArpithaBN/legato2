import java.util.Scanner;


public class Positive {

	  public static void main(String[] args) {
		  
		    System.out.println("Enter the number");
		    Scanner x=new Scanner(System.in);
			int i=x.nextInt();
			validate(i);
	  }

		static void validate(int num)
		{
			if(num>0)
				System.out.println("positive");
			else
				System.out.println("negative");
		}
		    
		    
}

