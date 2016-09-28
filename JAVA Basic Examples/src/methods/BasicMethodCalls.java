package methods;

/**
 * Demonstrates a few basic method calls in JAVA.
 * 
 * @author Zaid
 *
 */
public class BasicMethodCalls {

	public static void main(String[] args) {
		int max = getMax(4, -2);
		System.out.println("Max is " + max);
		
		double avg = getAverage(2, 5);
		System.out.println("Avg is " + avg);
		
		int[] array = {1, 2, 3, 4, 5};
		// NO NEED for System.out.println(..) since the method does that
		// No need because the method is VOID as well, so it does NOT return anything anyway.
		printArray(array);
		
		// In this case the method RETURNS a string representation of the array.
		// The method getArrayString(..) does NOT print anything.
		System.out.println(getArrayString(array));
	}

	/**
	 * Calculates the average of two numbers.
	 * 
	 * @param num1 - First number
	 * @param num2 - Second number
	 * @return Average of the given two numbers
	 */
	private static double getAverage(int num1, int num2) {
		return (num1 + num2) / 2;
	}

	/**
	 * Returns the larger number of the two.
	 * If the two numbers are equal then it returns the second one.
	 * 
	 * @param num1 - First number
	 * @param num2 - Second number
	 * @return Larger number
	 */
	private static int getMax(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} 
		
		// Only one return statement can be executed so there is no need for the ELSE statement.
		
		return num2;
	}

	/**
	 * Prints array elements separated by a space.
	 * 
	 * @param array - Given array that contains the elements
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}
	
	/**
	 * Constructs a string that represents the array elements separated by a space character.
	 * 
	 * @param array - Array to be displayed in a string
	 * @return String that represents the array
	 */
	private static String getArrayString(int[] array) {
		String s = "";
		
		for (int i = 0; i < array.length; i++) {
			s = s + array[i] + " ";
		}
		
		return s;
	}
}
