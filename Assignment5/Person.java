public class Person{ // object, manages the name of a person

	// instantiation of necessary variables
	private String name;

	// default constructor
	public Person(){ 
		this.name = "no name";
	}
	
	// constructors
	public Person(String theName){
		this.name = theName;
	}

	public Person(Person theObject){
		this.name = theObject.name;
	}

	// getters and setters
	public String getName(){
		return this.name;
	}
	public void setName(String theName){
		this.name = theName;
	}

	// returns string with name
	public String toString(){
		return this.name;
	}

	// tests if 2 names are identical
	public boolean equals(Person other){
		return this.getName().equals(other.getName());
	}
}
