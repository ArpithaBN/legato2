import java.util.Scanner;

public class VerticalString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=s.nextLine();
		for(int i=0;i<a.length();i++)
		{
			char letter=a.charAt(i);
			System.out.println(letter);
		}
	}

}
