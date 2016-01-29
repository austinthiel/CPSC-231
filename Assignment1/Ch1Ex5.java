public class Ch1Ex5{
	public static void main(String[] args){

		String hateLine = "I hate the beach and I hate camping.";

		System.out.println("Original Line: " + hateLine);

		System.out.println("New Line: " + hateLine.replaceFirst("hate", "love")); // replaces first occurence of string ONLY
		


	}
}
