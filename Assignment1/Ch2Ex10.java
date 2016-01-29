import java.util.Scanner;
import java.text.DecimalFormat;

public class Ch2Ex10{
	public static void main(String[] args){

		DecimalFormat df = new DecimalFormat("0.00");
		Scanner keyboard = new Scanner(System.in);		

		System.out.println("Input name of item 1: ");
		String name1 = keyboard.nextLine();
		System.out.println("Input quantity of item 1: ");
		int quantity1 = keyboard.nextInt();
		System.out.println("Input price of item 1: ");
		double price1 = keyboard.nextDouble();
		
		Scanner keyboard2 = new Scanner(System.in);

		System.out.println("Input name of item 2: ");
		String name2 = keyboard2.nextLine();
		System.out.println("Input quantity of item 2: ");
		int quantity2 = keyboard2.nextInt();
		System.out.println("Input price of item 2: ");
		double price2 = keyboard2.nextDouble();

		Scanner keyboard3 = new Scanner(System.in);

		System.out.println("Input name of item 3: ");
		String name3 = keyboard3.nextLine();
		System.out.println("Input quantity of item 3: ");
		int quantity3 = keyboard3.nextInt();
		System.out.println("Input price of item 3: ");
		double price3 = keyboard3.nextDouble();

		System.out.println();
		System.out.println("Your bill: ");
		System.out.println();

		double total1 = price1 * quantity1;
		double total2 = price2 * quantity2;
		double total3 = price3 * quantity3;

		//formatting data to columns with floats rounded to 2 decimal places
		System.out.printf("%-30s %-10s %-10s %-10s %n", "Item", "Quantity", "Price", "Total");
		System.out.printf("%-30s %-10s %-10s %-10s %n", name1, quantity1, df.format(price1), df.format(total1)); 
		System.out.printf("%-30s %-10s %-10s %-10s %n", name2, quantity2, df.format(price2), df.format(total2));
		System.out.printf("%-30s %-10s %-10s %-10s %n", name3, quantity3, df.format(price3), df.format(total3));

		System.out.println();

		double subtotal = total1 + total2 + total3;
		double tax = subtotal * 0.0625;
		double total = subtotal + tax;
		
		System.out.printf("%-30s %-10s %-10s %-10s %n", "Subtotal", "", "", df.format(subtotal));
		System.out.printf("%-30s %-10s %-10s %-10s %n", "6.25% sales tax", "", "", df.format(tax));
		System.out.printf("%-30s %-10s %-10s %-10s %n", "Total", "", "", df.format(total));

	}
}
