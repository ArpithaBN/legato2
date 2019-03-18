import java.util.HashMap;
public class HashMapJava {
		  public static void main(String[] args) {
		    HashMap<String, String> a = new HashMap<String, String>();
		    a.put("a", "car");
		    a.put("b", "Bikes");
		    a.put("c", "flights");
		    a.put("d", "trains");
		    
		 // Print keys
		    for (String i : a.keySet()) {
		      System.out.println(i);
		    }
		    
		    //Print Values
		    for (String i : a.values()) {
		      System.out.println(i);
		    }
		    
		    
		    //Print Keys and Values
		    for (String i : a.keySet()) 
		    {
		        System.out.println("key= " + i + " value= " + a.get(i));
		    }
		    
		    
		    System.out.println(a.get("b")); 
		    System.out.println(a.size());
		  }
		}





