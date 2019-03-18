
public class ReversingJava {
	public static void main(String[] args) {
		int arp[]={1,2,3,4};
		for(int i=0; i<arp.length/2;i++)
		{
			int temp = arp[i];
			arp[i]=arp[arp.length-1-i];
			arp[arp.length-1-i]=temp;
			
		}
		for (int j = 0; j < arp.length; j++) {
			System.out.println(arp[j]);
		}
		
		
			
		}
		
	}


