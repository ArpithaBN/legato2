public class AssesmentSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = new String[] { "Cars", "Bikes", "Trains", "Flights"};
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				String tmp = "";
				if ((s[i].compareTo(s[j]) > 0)) {
					tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
				}
			}
			
			System.out.println(s[i]);
		}

	}
}
