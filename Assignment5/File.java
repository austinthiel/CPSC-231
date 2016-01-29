public class File extends Document{ // object, manages characteristics of a file

	// instantiating necessary variables
	private String pathname;

	// default constructor
	public File(){
		super();
		this.pathname = "no pathname";
	}

	// constructor
	public File(String a_Pathname, String a_Text){
		super(a_Text);
		this.pathname = a_Pathname;
	}

	// return String with file data
	public String toString(){
		return "Pathname: " + pathname + "\n" +
			"Text: " + super.toString();
	}
	
	// test if 2 files are equal
	public boolean equals(File other){
		return this.getPathname().equals(other.getPathname());
	}

	// getters and setters
	public String getPathname(){
		return pathname;
	}
	public void setPathname(String a_Pathname){
		this.pathname = a_Pathname;
	}
}
