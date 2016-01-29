import java.io.*;
import java.util.*;

// Print computations for menu items as they are requested by the user
public class OptionActions{ 

	Scanner in = new Scanner(System.in);
	public String path = "";
	private PrintWriter pw;
	private String filename;
	private File f;
	
	// Writes to console and log
	public void writer(File file, String text) throws FileNotFoundException{
		pw = new PrintWriter(new FileOutputStream(file,true));
		pw.println(text);
		pw.close();
		System.out.println(text);	
	}	

	// List the contents of a directory provided by the user
	public void Choice1(File file, String path){
		try{
			File f = new File(path);
			File[] strFileArray = f.listFiles();
		
			for(int i = 0; i < strFileArray.length; i++){
				this.writer(file, strFileArray[i].getName());
			}
			System.out.println();	
		}
		catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	// List the contents of a directory and its subdirectories 
	public void Choice2(File file, String path){
		try{
			f = new File(path);
			File[] strFileArray = f.listFiles();

			for(int i = 0; i < strFileArray.length; i++){
				if(strFileArray[i].isFile()){
					filename = strFileArray[i].getName();
					this.writer(file, filename);
				}
				else if(strFileArray[i].isDirectory()){
					filename = strFileArray[i].getPath();
					this.Choice2(file, filename);
					System.out.println(strFileArray[i].getPath());
					System.out.println(strFileArray[i].getName());
					this.writer(file, filename);
				}
			System.out.println();
			}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}

	}

	// Locate a file with a given name
	public void Choice3(File file, String search, String path){
		try{	
			f = new File(path);
			File[] strFileArray = f.listFiles();

			for(int i = 0; i < strFileArray.length; i++){
				if(strFileArray[i].getName().equals(search)){
					this.writer(file, strFileArray[i].getParentFile().toString());
				}
				else if(strFileArray[i].isDirectory()){
					this.Choice3(file, search, strFileArray[i].toString());
				}
			}
			
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}

	}

	// Locate files with a given file extension
	public void Choice4(File file, String search, String path){
		try{
			f = new File(path);
			File[] strFileArray = f.listFiles();

			for(int i = 0; i < strFileArray.length; i++){
				if(strFileArray[i].isFile()){
					filename = strFileArray[i].toString();
					if(filename.lastIndexOf(".") > 0){
						int last = filename.lastIndexOf(".");
						String st = filename.substring(last);
						if(st.equals(search)){
							this.writer(file, filename);
						}
					}
				}
				if(strFileArray[i].isDirectory()){
					this.Choice4(file, search, strFileArray[i].toString());
				}
			}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}

	}

	// Concatenate the contents of 2 files into a third
	public void Choice5(File file, String f1, String f2, String f3){
		try{
			BufferedReader br = new BufferedReader(new FileReader(f1));
			BufferedReader br2 = new BufferedReader(new FileReader(f2));
			PrintWriter pw2 = new PrintWriter(new FileOutputStream(f3, true));

			String line = "";
			String line2 = "";
			
			line = br.readLine();
			while(line != null)
			{
				this.writer(file, line);
				pw2.println(line);
				line = br.readLine();
			}
	
			line2 = br2.readLine();
			while(line2 != null)
			{
				this.writer(file, line2);
				pw2.println(line2);
				line2 = br2.readLine();
			}
			br.close();
			br2.close();
			pw2.close();
			System.out.println();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}

	}

	// Exit
	public void Choice6(File file){
		try{
			System.out.println("Exiting... \n");
			if (file.getName().equals("tempLog.txt")){
				file.delete();
			}
			System.exit(0);
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
