package jobScraper;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile {
	
	// file path
	private String path;
	
	// overwrite by default
	private boolean append = false;
	
	public WriteFile(String filePath) {
		this.path = filePath;
	}
	
	public WriteFile(String filePath, boolean append) {
		this.path = filePath;
		this.append = append;
	}
	
	public void writeToFile(String text) throws IOException {
		// file writer writes bytes
		FileWriter write = new FileWriter(path, append);
		
		// print writer for line by line character writing
		PrintWriter print = new PrintWriter(write);
		print.printf("%s" + "/n", text);
		
		print.close();
	}
	
	public static void Write(String[] args) {
		WriteFile data = new WriteFile("test");
		
		try {
			data.writeToFile("test");
			System.out.println("So far so good");
		} 
		catch(IOException ex)
		{
			ex.printStackTrace();
			System.out.println("Wrong!");
		}
	}
	
}
