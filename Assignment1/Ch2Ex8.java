import java.util.Scanner;

public class Ch2Ex8{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter a line of text: ");
		String lineOfText = keyboard.nextLine();
		
		System.out.println("Uppercase: " + lineOfText.toUpperCase());
		System.out.println("Lowercase: " + lineOfText.toLowerCase());		

	}
}
