import java.util.ArrayList;
	import java.util.List;
	
	
public class AssesmentArrayOfStrings {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List a=new ArrayList();
			a.add("A");
			a.add("B");
			a.add("C");
			a.add("D");
			
			String temp;
			int i;
			System.out.println(a);
			
			
			for( i=0; i<a.size()/2; i++)
			{
			temp =(String)a.get(i);
			a.set(i,a.get(a.size()-1-i));
			a.set(a.size()-1-i, temp);
			
			}
			System.out.println(a);
		}

	}


