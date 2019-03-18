import java.util.Scanner;
	public class MovieDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int count=3;
		Movie[] d=new Movie[count];
		for (int i=0; i<count; i++) {
			System.out.println("movie_id:");
			int movie_id=sc.nextInt();
			System.out.println("Name:");
			String name=sc.next();
			System.out.println("duration:");
			int duration=sc.nextInt();
			
		Movie e =new Movie(movie_id, name, duration);
		e.setMovie_id(movie_id);
		e.setName(name);
		e.setDuration(duration);
		d[i]=e;
		}
		
		for (int i=0;i<count;i++)
			System.out.println("Movie_id:"+d[i].getMovie_id()+" "+"Movie_name: "+d[i].getName()+" "+"Duration:"+d[i].getDuration());
		}
	}
	

