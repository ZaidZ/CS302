package methods;

/**
 * Demonstrates how references and methods work with arrays.
 * 
 * @author Zaid
 *
 */
public class ArrayReferences {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		BasicMethodCalls.printArray(array);
		
		multiplyArray(array, 2);
		BasicMethodCalls.printArray(array);
		
		int[] array2 = getMultipliedArray(array, 2);
		BasicMethodCalls.printArray(array2);
	}

	/**
	 * Multiplies every element of the array with the given number.
	 * The operation is executed on the given reference of the array
	 * so changes are present outside this method.
	 * 
	 * @param array - The given array which will be multiplied
	 * @param mul - Number which will multiply the array
	 */
	private static void multiplyArray(int[] array, int mul) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * mul;
		}
	}
	
	/**
	 * Multiplies every element of the array with the given number.
	 * A new array is made in which the results are stored. The old
	 * array is not changed at all.
	 * 
	 * @param oldArray - The elements that will be multiplied and stored in a new array
	 * @param mul - The number that will multiply the array
	 * @return A new copy of the multiplied array
	 */
	private static int[] getMultipliedArray(int[] oldArray, int mul) {
		int[] newArray = new int[oldArray.length];
		
		for (int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i] * mul;
		}
		
		return newArray;
	}

}
