import java.util.Scanner;

public class SwappingTwoNumbers {
	public static void main(String[] args) {
		
		
		  int x, y, temp;
	      System.out.println("Enter the value of x and y");
	      Scanner in = new Scanner(System.in);
	     
	      x = in.nextInt();
	      y = in.nextInt();
	     
	      System.out.println("before Swapping"+x+y);
	     
	      temp = x;
	      x = y;
	      y = temp;
	     
	      System.out.println("After Swapping" +x+y);
	   }
	


	}
	


