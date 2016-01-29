import java.util.Scanner;

public class Ch2Ex3{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter an integer: ");
		int firstInt = keyboard.nextInt();

		System.out.print("Please enter another integer: ");
		int secondInt = keyboard.nextInt();

		int sum = firstInt + secondInt;
		int difference = firstInt - secondInt;
		int product = firstInt * secondInt;

		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);		

	}
}
