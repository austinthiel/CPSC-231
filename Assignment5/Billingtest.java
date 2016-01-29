public class Billingtest{ // tests the billing inheritance tree
	public static void main(String[] args){

		// instantiating objects
		Date dat1 = new Date("April", 1, 1969);
		Doctor dr1 = new Doctor("Dr. Mort", dat1, 2500000.00, "Obgyn", 25.00);
		Patient paciente1 = new Patient("Lil T", dr1);
		Billing bill1 = new Billing(paciente1, dr1, 25.00);

		Date dat2 = new Date("January", 1, 1972);
		Doctor dr2= new Doctor("Dr. Doctor", dat2, 690000.00, "Surgeon", 75.00);
		Patient paciente2 = new Patient("Topeka", dr2);
		Billing bill2 = new Billing(paciente2, dr2, 55.00);

		// printing results
		System.out.println(bill1.toString());
		System.out.println();
		System.out.println();
		System.out.println(bill2.toString());
		System.out.println();
		System.out.println("Total income: " + (bill1.fee + bill2.fee));
	}
}
