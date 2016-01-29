public class DocumentDemo{
	public static void main(String[] args){

		// test constructors
		Document doc1 = new Document();
		Document doc2 = new Document("This is a pretty good example of what text looks like.");

		Email mail1 = new Email();
		Email mail2 = new Email("Austin", "Thiel", "Student", "This is a pretty good example of what text looks like.");

		File f1 = new File();
		File f2 = new File("C:-Users-athiel-Documents-CPSC231-Assignment5", "This is a pretty good example of what text looks like.");

		System.out.println(doc1.toString());
		System.out.println(doc2.toString());
		System.out.println(mail1.toString());
		System.out.println(mail2.toString());
		System.out.println(f1.toString());
		System.out.println(f2.toString());

		// pass through the subroutine in textbook
		System.out.println();

		System.out.println(ContainsKeyword(doc1, "pretty"));
		System.out.println(ContainsKeyword(doc2, "pretty"));
		System.out.println(ContainsKeyword(mail1, "pretty"));
		System.out.println(ContainsKeyword(mail2, "pretty"));
		System.out.println(ContainsKeyword(f1, "pretty"));
		System.out.println(ContainsKeyword(f2, "pretty"));
	}

	public static boolean ContainsKeyword(Document docObject, String keyword){
		if(docObject.toString().indexOf(keyword, 0) >= 0)
			return true;
		return false;
	}
}
