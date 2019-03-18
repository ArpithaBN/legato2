
public class NonRepeatingchar {

	public static void main(String[] args) {
		
		Character[] data = {'i','i','h','t'};

		int j = 0;
		int matches = 0;
		for (int i = 0; i < data.length; i++) {
			
			if (data[i] != data[j]) {
				if (matches == 1) {
					break;
				} else {
					data[j] = data[i];
					matches = 1;
				}
			} else {
				matches++;
			}	
		}
		
		System.out.println(data[j]);
	}
}



	


