
	import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


	public class MovieArrayList {
	private static int movie_id;

	public static void main(String[] args) {
		ArrayList<Movie> a1 = new ArrayList<Movie>();
		Scanner s = new Scanner(System.in);
		System.out.println("How many objects u want to create");
		int count = s.nextInt();
		for(int i = 0;i<count;i++)
		{
			System.out.println("please enter the name:");
			String name = s.next();
			System.out.println("enter id");
			int duration = s.nextInt();
			Movie m = new Movie(movie_id, name, duration);
			m.setName(name);
			m.setMovie_id(movie_id);
			m.setDuration(duration);
			a1.add(m);
			
		}
		
		
		
	}
		
	}



