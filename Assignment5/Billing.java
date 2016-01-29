public class Billing{ // determines cost of seeing a specific doctor

	//instantiation of necessary objects and variables
	public Patient patient;
	public Doctor doctor;
	public double fee;

	// default constructor
	public Billing(){
		patient = null;
		doctor = null;
		fee = 0;
	}
	
	// constructor
	public Billing(Patient a_patient, Doctor a_doctor, double a_fee){
		patient = a_patient;
		doctor = a_doctor;
		fee = a_fee;
	}

	//getters and setters
	public Patient getPatient(){
		return patient;
	}
	public void setPatient(Patient a_patient){
		patient = a_patient;
	}
	public Doctor getDoctor(){
		return doctor;
	}
	public void setDoctor(Doctor a_doctor){
		doctor = a_doctor;
	}
	public double getFee(){
		return fee;
	}
	public void setFee(double a_fee){
		fee = a_fee;
	}

	// test if 2 bills are identical
	public boolean equals(Billing other){
		return (patient.equals(other.getPatient()) && doctor.equals(other.getDoctor()) 				&& fee == other.getFee());
	}

	//print results
	public String toString(){
		return ("Patient: " + patient + " " + "Doctor: " + doctor + " " + "Fee: " + 			fee);
	}
}
