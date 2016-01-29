import java.util.Scanner;

public class Ch2Ex2{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		String pigLatin = "ay";
		
		System.out.println("Please enter your first name (all lowercase): ");
		String first = keyboard.nextLine();

		System.out.println("Please enter your last name (all lowercase): ");
		String last = keyboard.nextLine();

		//print second letter capitalized + rest of string unchanged + first letter appended to end + "ay"
		String firstAnswer = first.substring(1,2).toUpperCase() + first.substring(2, first.length()) + first.substring(0, 1) + pigLatin;
		String lastAnswer = last.substring(1,2).toUpperCase() + last.substring(2, last.length()) + last.substring(0, 1) + pigLatin;

		System.out.println("Original Name : " + first + " " + last);
		System.out.println("Your name in pig latin : " + firstAnswer + " " + lastAnswer); 

	}
}

