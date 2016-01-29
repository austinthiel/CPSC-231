import java.io.*;

public class Demo{
	public static void main(String[] args){ // open a file, read the DNA sequences, and print the (reverse) complements
		try{
			DNA dna = new DNA();
			Reader fr = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(fr);
			PrintWriter pw = new PrintWriter("testresults.txt");
			String data;
			while((data = br.readLine()) != null){
				pw.println("Original: ");
				pw.println(data);
				pw.println("Complement: ");
				pw.println(dna.complement(data));
				pw.println("Reverse Complement: ");
				pw.println(dna.reverseComplement(data));
				pw.println();

				System.out.println("Original: ");
				System.out.println(data);
				System.out.println("Complement: ");
				System.out.println(dna.complement(data));
				System.out.println("Reverse Complement: ");
				System.out.println(dna.reverseComplement(data));
				System.out.println();
				
			}
			pw.close();
		}catch(Exception e){
			System.out.println("ERROR: One or more files are not found");
		}
	}
}
