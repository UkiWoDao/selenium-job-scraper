package jobScraper;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile {
	
	// file path
	private String path;
	
	// overwrite by default
	private boolean append = false;
	
	public WriteFile(String file_path) {
		this.path = file_path;
	}
	
	public WriteFile(String file_path, boolean append) {
		this.path = file_path;
		this.append = append;
	}
	
	public void writeToFile(String text) throws IOException {
		// filewriter writes bytes
		FileWriter write = new FileWriter(path, append);
		
		// printwriter for line by line character writing
		PrintWriter print = new PrintWriter(write);
		print.printf("%s" + "/n", text);
		
		print.close();
	}
	
}
