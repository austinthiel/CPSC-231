public class Truck extends Vehicle{ // object, manages characteristics of a truck

	// instantiating necessary variables
	private double loadCapTons;
	private int towCapPounds;

	// default constructor
	public Truck(){
		super();
		this.loadCapTons = 0.0;
		this.towCapPounds = 0;
	}
	
	// constructor
	public Truck(double a_LoadCapTons, int a_TowCapPounds, Vehicle a_Vehicle, Person a_Person){
		super(a_Vehicle, a_Person);
		this.loadCapTons = a_LoadCapTons;
		this.towCapPounds = a_TowCapPounds;
	}

	// getters and setters
	public double getLoadCapTons(){
		return loadCapTons;
	}
	public void setLoadCapTons(double a_LoadCapTons){
		this.loadCapTons = a_LoadCapTons;
	}

	public int getTowCapPounds(){
		return towCapPounds;
	}
	public void setTowCapPounds(int a_towCapPounds){
		this.towCapPounds = a_towCapPounds;
	}

	// test of 2 truck objects are indentical
	public boolean  equals(Truck other){
		return this.getLoadCapTons() == other.getLoadCapTons() && 
			this.getTowCapPounds() == other.getTowCapPounds();
	}

	// return string with truck data (including the data it is derived from)
	public String toString(){
		return "Load Capacity (in tons): " + this.loadCapTons + "\n" +
			"Tow Capacity (in pounds): " + this.towCapPounds + "\n" +
			super.toString();
	}
}
