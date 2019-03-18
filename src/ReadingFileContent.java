
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFileContent {  
  public static void main(String[] args) throws IOException {  
	  
	  FileOutputStream fos=null;
    try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);  
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
    finally {
    	if(fos!=null)
    		fos.close();
    }
  }  
} 

