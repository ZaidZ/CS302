package input;

import java.util.Scanner;

/**
 * Demonstrates how to take input from the keyboard using Scanner.
 * 
 * @author Zaid
 *
 */
public class ScannerExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("a = ");
		int a = input.nextInt();
		
		System.out.print("b = ");
		int b = input.nextInt();
		
		input.close();
		
		System.out.println("Sum: " + (a + b));
	}

}
