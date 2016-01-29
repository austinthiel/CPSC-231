public class DoctorDemo{ // test class for problem #5 (doctor) 
    public static void main(String[] args){
/*
        HourlyEmployee joe = new HourlyEmployee("Joe Worker",
                                   new Date("January", 1, 2004), 50.50, 160);

        System.out.println("joe's longer name is " + joe.getName( ));

        System.out.println("Changing joe's name to Josephine.");
        joe.setName("Josephine");

        System.out.println("joe's record is as follows:");
        System.out.println(joe);
*/

	Doctor bob = new Doctor("Joe Worker", new Date("January", 1, 2004), 150000.00, "Physician", 49.99);

	System.out.println(bob.toString());
	
       }
}
