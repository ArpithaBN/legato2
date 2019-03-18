
public class ReplaceString {
	public static void main(String[] args) {
		String str = "legato java";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' ')
			{
				str=str.replace(str.charAt(i),'I');
			}
				else
				{
					str=str.replace(str.charAt(i),' ');
					
				}
				
			}System.out.println(str);
		
			
	}

}

