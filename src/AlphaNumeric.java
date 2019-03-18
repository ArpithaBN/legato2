
public class AlphaNumeric {


		 public static void main(String[] args) {
			String str = "arpitha002";
			value(str);
		}
		 public static void value(String str)
		 {
		 int d=0; int c = 0; 
		for (int i =0;i<str.length();i++)
		{
		if(Character.isDigit(str.charAt(i))==true) {
			d=d+1;
		}
		else c = c+1;
		}
		System.out.println("numbers:"+d);
		System.out.println("alphabets:"+c);
		}
		}


     