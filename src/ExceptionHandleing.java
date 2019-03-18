import java.util.Scanner;

public class ExceptionHandleing {
	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		try{
			
		int x=10;
		int y=0;
		System.out.println(x/y);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			//System.out.println(e.printStackTrace());
		}
		
		
	}

}
