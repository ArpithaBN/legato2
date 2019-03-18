
import java.util.*;
 
class Palindrome
{
   public static void main(String args[])
   {
      String a, reverse = "";
      Scanner x= new Scanner(System.in);
     
      System.out.println("Enter a string");
      a= x.nextLine();
     
      int length = a.length();
     
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + a.charAt(i);
         
      if (a.equals(reverse))
         System.out.println("The string is a palindrome.");
      else
         System.out.println("Not a palindrome.");
         
   }
}      