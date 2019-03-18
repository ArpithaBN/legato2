import java.util.*;
public class Collections {
 public static void main(String[] args) {
 ArrayList arpi=new ArrayList();
 arpi.add("a");
 arpi.add("b");
 arpi.add("c");
 
 
 Iterator i=arpi.iterator();
 while(i.hasNext()){
	 System.out.println(i.next());
 }
 
 
 LinkedList vaidhya=new LinkedList();
 vaidhya.add("e");
 vaidhya.add("f");
 vaidhya.add("g");
 
 
 Iterator i1=vaidhya.iterator();
 while(i1.hasNext()){
	 System.out.println(i1.next());
 }
 
 
 
 Set a1=new HashSet();
 a1.add("s");
 a1.add("r");
 a1.add("o");
 Iterator i2=a1.iterator();
 while(i2.hasNext()){
	 System.out.println(i2.next());
 }
}
}
