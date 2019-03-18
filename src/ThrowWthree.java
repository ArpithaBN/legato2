
	public class ThrowWthree {
		static void checkAge(int age) {
			
			if(age<18){
				System.out.println("you are not eligible");
			}
			else{
				System.out.println("you can vote");
			}
		}
		
		public static void main(String[] args) {
			checkAge(80);
		}
	
	}
