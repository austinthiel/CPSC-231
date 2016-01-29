import java.util.Scanner;

public class Ch2Ex4{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Distance of commute (in miles): ");
		int miles = keyboard.nextInt();

		System.out.println("Automobile's fuel consumption (miles per gallon): ");
		int mpg = keyboard.nextInt();

		System.out.println("Price of 1 gallon of gas (ex. 3.29): ");
		double pricePerGallon = keyboard.nextDouble();

		double costOfCommute = (miles / mpg) * pricePerGallon;

		System.out.println("Cost of commute: $" + costOfCommute);

	}
}
