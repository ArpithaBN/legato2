
public class FinallyWthree {
	public static void main(String[] args) {
		try{
		int[] myNum={2,4,7};
		System.out.println(myNum[10]);
	}catch(Exception e)
		{
		System.out.println("Handling Exception");
	    } finally{
	    	System.out.println(" The 'try catch' is finished");
	    }

}
}
