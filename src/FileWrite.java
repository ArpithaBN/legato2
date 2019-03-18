
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {  
  public static void main(String[] args) {   
    try {  
      FileWriter myWriter = new FileWriter("C:\\Users\\arpitha\\workspace\\LEGATO\\src\\arp.text");
      myWriter.write("Java Sucks ");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
} 

