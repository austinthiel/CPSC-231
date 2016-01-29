import java.util.Scanner;

public class Ch2Ex7{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		int dollar = 100;

		System.out.print("Enter price of item: ");
		int price = keyboard.nextInt();

		int change = dollar - price;
		int quarters = change / 25;
		int dimes = (change % 25) / 10;
		int nickels = ((change % 25) % 10) / 5;

		System.out.println("You bought an item for " + price + " cents and gave me a dollar, so your change is...");
		System.out.println(quarters + " quarters,");
		System.out.println(dimes + " dimes, and");
		System.out.println(nickels + " nickels.");

	}
}
