import java.util.Scanner;

public class Vowels {

	public static int main(String[] args) {
		int noOfVowels=0;
		//Scanner s=new Scanner(System.in);
		String str = "Hello";
		//String value;
		//System.out.println("Enter the Vowels");
		
		char[] vowels= {'a','e','i','o','u'};
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			for(int j=0;j<vowels.length;j++)
			{
				if(ch==vowels[j])
				noOfVowels=noOfVowels+1;
			}
		}return noOfVowels;
		
	}
	
}
	

