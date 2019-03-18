import java.util.Scanner;

public class MovieObjects {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Movie arr[]=null;
		
		while (true) {

			System.out.println("Please enter 1 for new entry \n"

			+ "2 for displaying \n" + "3 for exit ");


			int option = s.nextInt();


			switch (option) {

			case 1:

			arr=addMovie(arr);

			break;

			case 2:

			displayMovie(arr);

			break;

			case 3:

			System.exit(0);

			break;

			default:

			System.out.println("Please enter correct option ");


			}

			}

			}
	

	public static Movie[] addMovie(Movie[] arr) {


	Scanner s = new Scanner(System.in);

	System.out.println("please enter the no of movie to be created");

	int count = s.nextInt();


	arr = new Movie[count];
	int noOfAttempts=0;


for (int i = 0; i < count; i++) {

	System.out.println("Please enter Movie id ");
	int movie_id = s.nextInt();
	
	/*while(!validatemovie_id(movie_id))
	{
		System.out.println("movie id can have only integer");
		System.out.println("Please Enter movie_id");
		movie_id=s.nextInt();
		noOfAttempts++;
		if(noOfAttempts>=3)
		{
			System.out.println("ypu exceeded max value");
			noOfAttempts=0;
			System.exit(0);	
			
			
	}
	}*/

	System.out.println("Please enter the movie name ");


	String name= s.next();
	
	
	/*while(!validatename(name))
	{
		System.out.println("movie name can only have chars");
		System.out.println("Please Enter the movie name");
		name=s.next();
		
		
	}*/

	System.out.println("Please enter movie duration ");


	int duration = s.nextInt();


	Movie m1 = new Movie(movie_id, name, duration);


	System.out.println("Total no of movie entry =" + Movie.getCount());


	m1.setMovie_id(movie_id);

	m1.setName(name);

	m1.setDuration(duration);


	arr[i] = m1;




	}

	return arr;


	}


	public static void displayMovie(Movie[] arr) {

	System.out.println("the array is " + arr);


	if (arr != null) {

	for (int i = 0; i < arr.length; i++) {

	System.out.println(arr[i]);

	}

	} else {

	System.out.println("no movie entries to be displayed");

	}

	}
		
	}


