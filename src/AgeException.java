import java.util.Scanner;

public class AgeException {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int age=s.nextInt();
	try{
		voter(age);
	}
	catch(AgesException e){
		System.out.println(e.getMessage());
	}
	
}

	
	static void voter(int age) throws AgesException
	{
	
	
	if(age>18)
	{
		System.out.println("you are an Adult now");
	}
	else
	{
		System.out.println("cannot vote");
		throw new AgesException("Age invalid");
	}
			
	
}

}

