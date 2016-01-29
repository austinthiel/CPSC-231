public class Ch1Ex3{
	public static void main(String[] args){

		String first = "austin";
		String last = "thiel";
		String pigLatin = "ay";

		//print 2nd letter capitalized + rest of string unchanged + 1st letter appended to end + "ay"
		String firstAnswer = first.substring(1,2).toUpperCase() + first.substring(2, first.length()) + first.substring(0, 1) + pigLatin;
		String lastAnswer = last.substring(1,2).toUpperCase() + last.substring(2, last.length()) + last.substring(0, 1) + pigLatin;

		System.out.println("Original Name : " + first + " " + last);
		System.out.println("Your name in pig latin : " + firstAnswer + " " + lastAnswer); 
		

	}
}
