
public class AgesException extends Exception {
	
		String msg;
		AgesException(String msg){
			super();
			this.msg=msg;
			
		}
		@Override
		public String getMessage(){
			return this.msg;
		}
	

}
