public class Patient extends Person{ // object, manages patient characteristics

	// instantiating necessary objects
	public Doctor physician;

	// default constructor
	public Patient(){
		super();
		physician = null;
	}

	// constructor
	public Patient(String a_name, Doctor a_physician){
		super(a_name);
		physician = a_physician;
	}

	// getters and setters
	public Doctor getPhysician(){
		return physician;
	}
	public void setPhysician(Doctor a_physician){
		physician = a_physician;
	}

	// test if 2 patient datas are identical
	public boolean equals(Patient other){
		return (physician.equals(other.getPhysician()) && super.equals(other));
	}
}
