import java.util.Scanner;

public class Addition {
	
	 public static void main(String[] args) {
		  
		    System.out.println("Enter the number");
		    Scanner x=new Scanner(System.in);
			int i=x.nextInt();
			validate(i);
	  }

		static void validate(int num)
		{
			int sum=0;
			for(int i=0;i<num;i++)
			{
				sum=sum+i;
			}
			System.out.println(sum);
		}

}
