public class Email extends Document{ // object, manages email data 

	// instantiating necessary variables
	private String sender;
	private String recipient;
	private String title;

	// default constructor
	public Email(){
		super();
		sender = "no sender";
		recipient = "no recipient";
		title = "no title";
	}
	
	// constructor
	public Email(String a_Sender, String a_Recipient, String a_Title, String a_Text){
		super(a_Text);
		this.sender = a_Sender;
		this.recipient = a_Recipient;
		this.title = a_Title;
	}

	// returns string with results
	public String toString(){
		return "Sender: " + this.sender + "\n" + 
			"Recipient: " + this.recipient + "\n" +
			"Title: " + this.title + "\n" +
			"Message: " + super.toString();
	}

	// tests if 2 emails are identical
	public boolean equals(Email other){
		return this.getSender().equals(other.getSender()) &&
			this.getRecipient().equals(other.getRecipient()) &&
			this.getTitle().equals(other.getTitle()); 
	}

	// getters and setters
	public String getSender(){
		return this.sender;
	}
	public void setSender(String a_Sender){
		this.sender = a_Sender;
	}

	public String getRecipient(){
		return this.recipient;
	}
	public void setRecipient(String a_Recipient){
		this.recipient = a_Recipient;
	}

	public String getTitle(){
		return this.title;
	}
	public void setTitle(String a_Title){
		this.title = a_Title;
	}
	
}

