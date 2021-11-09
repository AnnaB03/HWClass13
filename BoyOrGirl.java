package syntax.class13HW;

import java.util.Scanner;

public class BoyOrGirl {

	public static void main(String[] args) {
		/* Write a program that reads two people's first
		names and if they expecting boy or girl? 
				Based on the input suggests a name for a baby:
				Example Output:
				Mom’s first name? Mary
				Dad’s first name? Daniel
				Boy or Girl? boy
				Suggested baby name: DANRY
				Example Output:
				Mom’s first name? Mary
				Dad’s first name? Daniel
				Boy or Girl? girl
				Suggested baby name: MAIEL*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("What are your names?");
		String momname = scan.next();
		String dadname = scan.next();
		System.out.println("Are you expecting a boy or a girl?");
		String gender = scan.next();
		
		if (gender.equalsIgnoreCase("boy")) {
			System.out.println(dadname.toUpperCase().substring(0,3) + momname.toUpperCase().substring(2));
		} else if (gender.equalsIgnoreCase("girl")) {
			System.out.println(momname.toUpperCase().substring(0,3) + dadname.toUpperCase().substring(2));
		} else {
			System.out.println("Error");
		}
		
		
		
		
		
		}

}
