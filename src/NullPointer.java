import java.io.FileNotFoundException;
import java.io.FileReader;

public class NullPointer {
		public static void main(String[] args) {
			try{
			
			FileReader f=new FileReader("abc.txt");
			
			}
			catch(FileNotFoundException e){
				System.out.println(e);
			}
			
			
			
			/*try
			{
				String x=null;
				System.out.println(x.length());
			}
				catch(NullPointerException e)
				{
					System.out.println(e);
				}*/
		
			
			
			
			/*String x=null;
			
			if(x==null){
				System.out.println("you cant enter null");
			}
			else{
				System.out.println(x.length());
			}
		}*/
		

	}
	}

