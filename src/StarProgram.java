import java.util.Scanner;

public class StarProgram{
	public static void main(String[] args) 
    { 
       Scanner sc=new Scanner(System.in);
      System.out.println("enter the rows");
      int n1=sc.nextInt();
      System.out.println("enter the columns");
      int n2=sc.nextInt();
      
      for(int i=1;i<=n1;i++)
      {
    	  for(int k=1;k<=n1-i;k++)
    	  {
    		  System.out.println(" ");
    		  
    	  }
    	  for(int j=1;j<=2*i-1;j++)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
       
}
}