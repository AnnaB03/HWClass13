package syntax.class13HW;

public class Task2HW {

	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
		
		String word = "table";
		
	
		if (word.length()%2==1 && word.length()>=3) {
			System.out.println("The middle character in the String is: " + word.charAt(word.length()/2)); //CharAt returns word at specified index
			
		} else {
			System.out.println("Error, please change the word");
		}
		
	}

}
