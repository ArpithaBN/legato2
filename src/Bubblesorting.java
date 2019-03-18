import java.util.ArrayList;
import java.util.List;

public class Bubblesorting {
public static void main(String[] args) {
		
		List a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		int temp=0,i;
		System.out.println(a);

	int temp1=0;
	for(int i1=0;i1<a.size()-i1-1;i1++){
		for(int j=0;j<a.size()-i1-1;j++){
			if((int)a.get(j)>(int)a.get(j+1)){
				temp1=(int)a.get(j);
				a.set(j, (int)a.get(j+1));                            
				a.set(j+1,temp1);
				
			}
		}
	}
	System.out.println("sorted list is : "+a);

}
}
