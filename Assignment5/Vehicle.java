public class Vehicle extends Person{ // object, manages characteristics of a vehicle

	// instantiating necessary variables
	private String manufacturer;
	private int cylinders;
	private Person owner;

	// default constructor
	public Vehicle(){
		super();
		this.manufacturer = "no manufacturer";
		this.cylinders = 0;
		this.owner = null;
	}

	// constructors
	public Vehicle(Vehicle theObject, Person theObject2){
		super(theObject2);
		this.manufacturer = theObject.manufacturer;
		this.cylinders = theObject.cylinders;
		this.owner = theObject.owner;
	}

	public Vehicle(String a_Manufacturer, int a_Cylinders, Person a_Owner){
		super(a_Owner);
		this.cylinders = a_Cylinders;
		this.manufacturer = a_Manufacturer;
	}

	// return string with Vehicle data
	public String toString(){
		return "Manufacturer: " + this.manufacturer + "\n" +
			"Cylinders: " + this.cylinders + "\n" + 
			"Owner: " + super.toString();
	}

	// test if 2 vehicles are identical
	public boolean equals(Vehicle other){
		return this.getManufacturer().equals(other.getManufacturer()) &&
			this.getCylinders() == other.getCylinders() &&
			this.getOwner().equals(other.getOwner());
	}

	// getters and setters
	public String getManufacturer(){
		return this.manufacturer;
	}
	public void setName(String a_Manufacturer){
		this.manufacturer = a_Manufacturer;
	}

	public int getCylinders(){
		return this.cylinders;
	}
	public void setCylinders(int a_Cylinders){
		this.cylinders = a_Cylinders;
	}

	public Person getOwner(){
		return this.owner;
	}
	public void setOwner(Person a_Owner){
		this.owner = a_Owner;
	}
}
