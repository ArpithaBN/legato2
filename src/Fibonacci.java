import java.util.*;
public class Fibonacci {
	
		public static void main(String[] args) {
			Scanner x=new Scanner(System.in);
			System.out.println("enter the number upto the fibonacci number we search:");
			int number=x.nextInt();
			int x1=0,x2=1;
			//System.out.println("the fibonacci series is:"+x1+""+x2+"");
			int z=0;
			for(int i=0;i<number;i++)
			{
				z=x1+x2;
				System.out.println("the fibonacci "+(i+1)+" numbers is:"+x1+"");
				x1=x2;
				x2=z;
				
			}

		}

	}


