import java.util.HashMap;
public class HashmapRemove {
		 public static void main(String[] args) {
			    HashMap<String, Integer> cars = new HashMap<String, Integer>();
			    cars.put("Creta", 500);
			    cars.put("i20", 400);
			    cars.put("Mini", 700);
			    cars.put("Audi", 1000);
			    System.out.println(cars);
			    cars.remove("i20");
			    		
			    		
			   for (String i : cars.keySet()) 
			   {
			    System.out.println("key= " + i + " value= " + cars.get(i));
			   }

	}
	}



