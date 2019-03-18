import java.util.Scanner;

public class MultipleOccrences {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=S.nextLine();
		
		int c=0;
		for (int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='i'){
				c=c++;
		}
	System.out.println(str.charAt(i)+" "+c);
	c=0;
		}
		}
		}
		
	


