public class Ch4Ex6{ 

	public static void main(String[] args){
		
		// Main method is used ONLY for instantiating objects and accessing methods
		grade i = new grade(5,5,5,80,50); 	
		grade j = new grade(9,8,7,69,94);
		grade k = new grade(1,2,3,44,98);
		grade l = new grade(5,5,5,80,50);
		grade m = new grade(); // will provoke default constructor and use default variable values
		System.out.println(i.toString());
		System.out.println(j.toString());
		System.out.println(k.toString());
		System.out.println(l.toString());
		System.out.println(m.toString());
		System.out.println(i.equals(j)); // i WILL NOT be equal to j
		System.out.println(i.equals(l)); // i WILL be equal to l
	}

	public static class grade{

		// Variables needed for object instantiation and and some methods
		private int quiz1 = 0;
		private int quiz2 = 0;
		private int quiz3 = 0;
		private int midtermExam = 0;
		private int finalExam = 0;
		private double weighedEndingScore = 0.0;
		private char letterGrade = 'F';

		public grade(){ // default constructor uses default variable values as declared above

		}

		// Object instantiation and grabbing/setting given variables
		public grade(int instQuiz1, int instQuiz2, int instQuiz3, int instMidtermExam, int instFinalExam){
			this.quiz1 = instQuiz1;
			this.quiz2 = instQuiz2;
			this.quiz3 = instQuiz3;
			this.midtermExam = instMidtermExam;
			this.finalExam = instFinalExam;
			
			// Set these 2 variables because the problem wanted the methods to be void
			weighedEndingScore();
			letterGrade();
		}
		
		// Convert all scores to percentages (ex: score/100)
		public int percentQuiz1(){
			return this.quiz1 * 10; 
		}

		public int percentQuiz2(){
			return this.quiz2 * 10;
		}

		public int percentQuiz3(){
			return this.quiz3 * 10;
		}

		public int percentMidtermExam(){
			return this.midtermExam;
		}

		public int percentFinalExam(){
			return this.finalExam;
		}

		// Weigh the grades accordingly (Quizzes worth 25%, Midterm 35%, Final 40%)
		public double weighedQuizzes(){
			return (10 * (this.quiz1 + this.quiz2 + this.quiz3) / 3) * 0.25;
		}

		public double weighedMidtermExam(){
			return this.midtermExam * 0.35;
		} 

		public double weighedFinalExam(){
			return this.finalExam * 0.40;
		}

		// Add all weighed scores for a final percentage grade
		public void weighedEndingScore(){
			this.weighedEndingScore =  weighedQuizzes() + weighedMidtermExam() + weighedFinalExam();
		}

		// Give the final percentage grade its respective letter grade
		public void letterGrade(){
			if(this.weighedEndingScore >= 90){
				this.letterGrade = 'A';
			}else if(this.weighedEndingScore >= 80 && this.weighedEndingScore < 90){
				this.letterGrade = 'B';
			}else if(this.weighedEndingScore >= 70 && this.weighedEndingScore < 80){
				this.letterGrade = 'C';
			}else if(this.weighedEndingScore >= 60 && this.weighedEndingScore < 70){
				this.letterGrade = 'D';
			}else{
				this.letterGrade = 'F';
			}	
		}

		// test if the final percentage grade of 2 objects are equal
		public boolean equals(grade otherObject){
			if(this.weighedEndingScore == otherObject.weighedEndingScore){
				return true;
			}else{
				return false;
			}
		}
		
		// Cleanly print all computations
		public String toString(){
			return "\nQuiz 1: " + percentQuiz1() + "% \n"
			+ "Quiz 2: " + percentQuiz2() + "% \n"
		 	+ "Quiz 3: " + percentQuiz3() + "% \n" 
			+ "Midterm: " + percentMidtermExam() + "% \n" 
			+ "Final: " + percentFinalExam() + "% \n"
			+ "Overall Score: " + this.weighedEndingScore + "% \n" 
			+ "Letter Grade: " + this.letterGrade + "\n";
		}

		//Setters and Getters
		public void setQuiz1(int newValue){
			this.quiz1 = newValue;
		}
		public int getQuiz1(){
			return this.quiz1;
		}

		public void setQuiz2(int newValue){
			this.quiz2 = newValue;
		}
		public int getQuiz2(){
			return this.quiz2;
		}

		public void setQuiz3(int newValue){
			this.quiz3 = newValue;
		}
		public int getQuiz3(){
			return this.quiz3;
		}

		public void setMidtermExam(int newValue){
			this.midtermExam = newValue;
		}
		public int getMidtermExam(){
			return this.midtermExam;
		}

		public void setFinalExam(int newValue){
			this.finalExam = newValue;	
		}
		public int getFinalExam(){
			return this.finalExam;
		}
	}
}
