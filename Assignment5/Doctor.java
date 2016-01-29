public class Doctor extends SalariedEmployee{ // object, manages characteristics of a doctor

	// instantiating necessary variables
	private String specialty;
	private double fee;

	// default constructor
	public Doctor(){
		super();
		this.specialty = "no specialty";
		this.fee = 0.0;
	}

	// constructor
	public Doctor(String theName, Date theDate, double theSalary, String a_Specialty, double a_Fee){
		super(theName, theDate, theSalary);
		this.specialty = a_Specialty;
		this.fee = a_Fee;
	}

	// test if 2 doctors are identical
	public boolean equals(Doctor otherDoc){
        return (getName( ).equals(otherDoc.getName( )) 
                && getHireDate( ).equals(otherDoc.getHireDate( ))
                && getSalary() == otherDoc.getSalary()) 
		&& specialty.equals(otherDoc.specialty)
		&& fee == otherDoc.fee;
	}

	// getters and setters
	public String getSpecialty(){
		return this.specialty;
	}
	public void setSpecialty(String a_Specialty){
		this.specialty = a_Specialty;
	}

	public double getFee(){
		return this.fee;
	}
	public void setFee(double a_Fee){
		this.fee = a_Fee;
	}
}
