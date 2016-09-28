package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Reads from the exampleFile.in file present in this directory.
 * The file contains four lines:
 * 	1. A line containing text
 * 	2. A real number
 * 	3. A boolean value
 * 	4. An integer
 * 
 * The code below uses a Scanner object to read all those values and
 * store them accordingly. In the end, it also prints the values.
 * 
 * Things to check/try:
 * 	- Why not store everything in a single line? What happens then?
 * 	- Can the file content be stored in two lines?
 * 
 * @author Zaid
 * 
 */
public class ReadingFromFile {

	public static void main(String[] args) {
		File inputFile = new File("src/files/exampleFile.in");
		Scanner fileReader;
		
		try {
			fileReader = new Scanner(inputFile); // TRY to open the file
			System.out.println("File opened!");
		} catch (FileNotFoundException e) {
			// This block will only run if the file was not found.
			System.err.println("Failed to open file.");
			e.printStackTrace();
			System.exit(-1); 	// Terminate JVM with -1, indicating an error
			return; 			// Finish the method, just in case the previous line failed
		}
		
		String line = fileReader.nextLine();
		double realNumber = fileReader.nextDouble();
		boolean boolValue = fileReader.nextBoolean();
		int integer = fileReader.nextInt();
		
		fileReader.close();
		
		System.out.println("1st line: " + line);
		System.out.println("2nd line: " + realNumber);
		System.out.println("3rd line: " + boolValue);
		System.out.println("4th line: " + integer);
	}

}
