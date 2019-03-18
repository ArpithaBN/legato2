
	import java.util.*;
import java.util.regex.Pattern;


	public class AnimalTest {


	public static void main(String[] args) {

	// TODO Auto-generated method stub


	Scanner s = new Scanner(System.in);

	Animal arr[] = null;


	while (true) {

	System.out.println("Please enter 1 for new objects \n"

	+ "2 for displaying \n" + "3 for exit ");


	int option = s.nextInt();


	switch (option) {

	case 1:

	arr=addAnimals(arr);

	break;

	case 2:

	displayAnimals(arr);

	break;

	case 3:

	System.exit(0);

	break;

	default:

	System.out.println("Please enter correct option ");


	}

	}

	}


	public static Animal[] addAnimals(Animal[] arr) {


	Scanner s = new Scanner(System.in);

	System.out.println("please enter the no of objects to be created");

	int count = s.nextInt();


	arr = new Animal[count];
	int noOfAttempts=0;


for (int i = 0; i < count; i++) {

	System.out.println("Please enter animal name ");
	String name = s.next();
	
	while(!validateName(name))
	{
		System.out.println("Name can only have chars");
		System.out.println("Please Enter the animal name again");
		name=s.next();
		noOfAttempts++;
		if(noOfAttempts>=3)
		{
			System.out.println("ypu exceeded max value");
			noOfAttempts=0;
			System.exit(0);	
			
			
	}
	}

	System.out.println("Please enter animal breed ");


	String breed = s.next();
	
	
	while(!validateBreed(breed))
	{
		System.out.println("Breed can only have chars");
		System.out.println("Please Enter the breed name again");
		name=s.next();
		
		
	}

	System.out.println("Please enter animal age ");


	int age = s.nextInt();


	Animal a1 = new Animal();


	System.out.println("Total no of objects =" + Animal.getCount());


	a1.setName(name);

	a1.setAge(age);

	a1.setBreed(breed);


	arr[i] = a1;




	}

	return arr;


	}


	public static void displayAnimals(Animal[] arr) {

	System.out.println("the array is " + arr);


	if (arr != null) {

	for (int i = 0; i < arr.length; i++) {

	System.out.println(arr[i]);

	}

	} else {

	System.out.println("no objects to be displayed");

	}

	}
	

public static boolean validateName(String name){
	
	if(Pattern.matches("^[A-Za-z]+$", name))
			 return true;
else
		return false;
	
}
	

public static boolean validateBreed(String breed){
	
	if(Pattern.matches("^[A-Za-z]+$", breed))
			 return true;
else
		return false;
	
}
	
public static String reversestr(String breed)
{
	String reverse="";
	for(int i=breed.length()-1;i>=0;i--)
		reverse=reverse+breed.charAt(i);
	
	return reverse;
	
}

}