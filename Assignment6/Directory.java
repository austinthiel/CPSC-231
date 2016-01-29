import java.io.*;
import java.util.*;

public class Directory{
	
	private String m_input;
	private String m_input2;
	private String m_input3;

	OptionActions oa = new OptionActions();
	Scanner in = new Scanner(System.in);
	public File logFile;

	// Ask user if they would like a log file stored (and create it)
	public void Start() throws IOException{
		while(true){
			System.out.print("\nDump results to a log file? (y/n): ");
			String input = in.next();

			switch(input){
				case "y":
					System.out.print("Name the file (including extension!): ");
					String logFile_input = in.next();
					logFile = new File(logFile_input);
					break;
				case "n":
					logFile = new File("tempLog.txt");
					break;
				default:
					System.out.println("Invalid Input");
					continue;
			}
			System.out.println();
			break;
		}
		logFile.createNewFile();
		this.Directory();
	}

	//Display and keep menus active
	public void Directory() throws IOException{	
		while(true){
			System.out.print("1.) List contents of a directory \n" +
						"2.) List the contents of a directory and its subdirectories \n" +
						"3.) Locate a file with a given name \n" +
						"4.) Locate files with a given file extension \n" +
						"5.) Concatenate the contents of 2 files \n" + 
						"6.) Exit \n");

			// Take user choice and call appropriate methods
			while(true){
				System.out.println();
				System.out.print("Choose a number: ");
				String input = in.next();

				switch(input){
					case "1":
						System.out.println("File Path: ");
						m_input = in.next();
						oa.Choice1(logFile, m_input);
						break;
					case "2":
						System.out.println("File Path: ");
						m_input = in.next();
						oa.Choice2(logFile, m_input);
						break;
					case "3":
						System.out.println("File name with extension: ");
						m_input = in.next();
						System.out.println("Base File path (ex: /home/): ");
						m_input2 = in.next();	
						oa.Choice3(logFile, m_input, m_input2);
						break;
					case "4":
						System.out.println("File Extension: ");
						m_input = in.next();
						System.out.println("File path: ");
						m_input2 = in.next();
						oa.Choice4(logFile, m_input, m_input2);
						break;
					case "5":
						System.out.println("First Filename: ");
						m_input = in.next();
						System.out.println("Second Filename: ");
						m_input2 = in.next();
						System.out.println("Name of output file: ");
						m_input3 = in.next();
						oa.Choice5(logFile, m_input, m_input2, m_input3);
						break;
					case "6":
						oa.Choice6(logFile);
						break;
					default:
						System.out.println("Invalid Input");
						System.out.println();
						break;
				}
				break;
			}
		}	
	}
}
