import java.util.Scanner;
public class ReverseString {
	
public static void main(String[] args) {
	/*String n;
	String n1 ="";
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the name");
	n=sc.next();
	
	int length=n.length();
    for (int i =length-1 ;i>=0; i--)
       n1=n1 +n.charAt(i);
        n=n1;
	    System.out.println("Reverse of the string is:"+n);*/
	
	
	int a[]={1,2,3,4};
	for(int i=0;i<a.length/2;i++) {
		int temp=a[i];
		a[i]=a[a.length-1-i];
		a[a.length-1-i]=temp;
	}
	for(int j=0;j<a.length;j++) {
		System.out.print(a[j]);
	}
	
}
}


