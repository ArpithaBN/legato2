import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c,fact=1;
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
	
		n=in.nextInt();
		
		if(n<0)
			System.out.println("Number should not be Zero");
		else{
			for(c=1;c<=n;c++)
				fact=fact*c;
			
			System.out.println("Factorial of "+n+" is="+fact);
		}

	}

}
