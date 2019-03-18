import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int n = 0,reverse=0;
             System.out.println("Enter the number");
             Scanner x=new Scanner(System.in) ;
             n=x.nextInt();
             while(n!=0)
             {
            	 reverse = reverse * 10;
                 reverse = reverse + n%10;
                 n = n/10;
            	 
             }
             System.out.println("Reverse of the number is " + reverse);
             
	}

}																						
