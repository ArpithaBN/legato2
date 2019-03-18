import java.util.Scanner;
import java.util.regex.Pattern;

public class NameClassException {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name=s.next();
		
		boolean flag=ValidateName(name);
		if(flag)
			System.out.println("valid name");
		else
			System.out.println("invalid name");
		ValidateName(name);
	}
public static boolean ValidateName(String name){
	String pattern ="^[A-Za-z]+$";
	if(Pattern.matches(pattern, name))
	{
		return true;
		
	}else{
		return false;
	}
}
}
