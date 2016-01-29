public class VehiclePersonDemo{ // tester for problem #6 (vehicle/person)
	public static void main(String[]args){

		// instantiating objects
		Person p1 = new Person();
		Person p2 = new Person("Bob Lotion");	
	
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("Nissan", 4, p2);

		Truck t1 = new Truck();
		Truck t2 = new Truck(5.2, 40000, v2, p2);

		// print tests
		System.out.println(p1.toString());

		System.out.println();	

		System.out.println(p2.toString());

		System.out.println();

		System.out.println(v1.toString());

		System.out.println();	

		System.out.println(v2.toString());

		System.out.println();

		System.out.println(t1.toString());

		System.out.println();	

		System.out.println(t2.toString());

		System.out.println();

	}
}
