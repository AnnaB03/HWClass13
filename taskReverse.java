package syntax.class13HW;

public class taskReverse {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday to yadnuS).
		
		String word = "computer";
		
		for (int i = word.length()-1; i>=0; i--) {
			System.out.print(word.charAt(i));
		}

	}

}
