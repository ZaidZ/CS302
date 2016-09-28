package arrays;

/**
 * Demonstrates simple manipulations used on arrays in JAVA.
 * The first example directly makes an array of 1, 2, 3, 4, 5 and then prints it.
 * The second example creates an empty array and then "manually" puts elements in it, then printing it.
 * 
 * @author Zaid
 *
 */
public class BasicManipulations {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5}; // One way of making arrays
		
		for (int i = 0; i < array1.length; i++) { // Iterating through an array
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		
		int length = 5;
		int[] array2 = new int[length]; // Making an empty array of zeroes
		
		array2[0] = 3; // First element of the array
		array2[1] = 1;
		array2[2] = 4;
		// array2[3] is not set!
		array2[4] = 5; // Last element of the array
		
		for (int i = 0; i < length; i++) {
			System.out.print(array2[i] + " ");
		}
	}

}
