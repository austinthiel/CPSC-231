public class Document{ // prints text
	
	//instantiation of necessary variables
	private String text;

	// base constructor
	public Document(){
		this.text = "no text";
	}

	// constructor
	public Document(String a_Text){
		this.text = a_Text;
	}

	// getters and setters
	public String getText(){
		return this.text;
	}
	public void setText(String a_Text){
		this.text = a_Text;
	}

	// test if 2 texts are identical
	public boolean equals(Document other){
		return this.getText().equals(other.getText());
	}
	// print results
	public String toString(){
		return "Text: " + this.text;
	}
}
