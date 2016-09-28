package recursion;

/**
 * Demonstrates classic recursion where the base case and recursion formula are specified.
 * 
 * The result:
 * 		result = 5! = 120
 * is obtained by doing the following steps:
 * 		1) result = calculateFactorial(5)
 * 		2) result = 5 * calculateFactorial(4)
 * 		3) result = 5 * 4 * calculateFactorial(3)
 * 		4) result = 5 * 4 * 3 * calculateFactorial(2)
 * 		5) result = 5 * 4 * 3 * 2 * calculateFactorial(1)
 * 		6) result = 5 * 4 * 3 * 2 * 1 * calculateFactorial(0)
 * 		7) result = 5 * 4 * 3 * 2 * 1 * 1	// Base case stops the recursion
 * 		8) result = 120
 * 
 * Why is the base case for n = 0, and NOT for n = 1, since there is an extra number to multiply?
 * - Because 0! = 1 and we want to cover that case as well. Setting the base case to n = 1 would
 *   result in an infinite recursion for n = 0.
 * 
 * @author Zaid
 *
 */
public class ClassicRecursion {

	public static void main(String[] args) {
		int n = 5;
		int result = calculateFactorial(n);
		
		System.out.println(n + "! = " + result);
	}
	
	/**
	 * Calculates the factorial of a number, i.e. result = n!.
	 * 
	 * @param n - Given number of which the factorial is needed
	 * @return Result of the factorial operation
	 */
	public static int calculateFactorial(int n) {
		// Base case
		if (n == 0) { 
			return 1;
		}
		
			   // Recursion formula
		return n * calculateFactorial(n - 1);
	}

}
