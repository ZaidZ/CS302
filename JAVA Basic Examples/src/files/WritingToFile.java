package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Opens or creates a file named exampleWrittenFile.out in the same directory this
 * class is in. If it does not appear in the IDE then refresh the folder in the IDE.
 * 
 * The writer then writes a string, a double, two strings in one line and boolean value.
 * That all works with the same method println thanks to the magic of method overloading!
 * 
 * Things to check/try:
 * 	- What happens if you run it twice? Do you have more things in the file?
 * 
 * @author Zaid
 * 
 */
public class WritingToFile {
	public static void main(String[] args) {
		File outFile = new File("src/files/exampleWrittenFile.out");
		PrintWriter fileWriter;
		
		try {
			fileWriter = new PrintWriter(outFile); // TRY to open/create the file!
			System.out.println("Opened file!");
		} catch (FileNotFoundException e) {
			// Fails if the file does not exist AND a new one with that name cannot be made
			System.err.println("Cannot write to a file with that name.");
			e.printStackTrace();
			System.exit(-1);
			return;
		}
		
		fileWriter.println("Writing a string.");
		fileWriter.println(3.1415923);
		fileWriter.print("In one");
		fileWriter.print(" line");
		fileWriter.println();
		fileWriter.println(false);
		
		fileWriter.close();

		System.out.println("Written everything to the file!");
	}
}
