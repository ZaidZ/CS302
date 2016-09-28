package algorithms;

/**
 * Demonstrates a few simple algorithms with prime numbers.
 * 
 * A prime number is a number that is ONLY divisible by 1 and itself.
 * 
 * @author Zaid
 *
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println(isPrime(128));
		System.out.println(isPrime(17));
		
		System.out.println(countHowManyPrimes(2, 100));
	}

	/**
	 * Determines whether a number is a prime number.
	 * 
	 * @param num - Number that needs to be checked
	 * @return true if the number is a prime number, false otherwise
	 */
	private static boolean isPrime(int num) {
		// Go from [2, num)
		// If it is divisible by ANY number in that range it is NOT a prime number
		for (int div = 2; div < num; div++) {
			if (num % div == 0) {
				return false;
			}
		}
		
		// If it survives the for loop above then it is a prime number
		return true;
	}
	
	/**
	 * Counts how many prime numbers are there in the given range [start, end].
	 * 
	 * @param start - Starting number of the range
	 * @param end - The last number in the range
	 * @return Integer representing how many primes are there in [start, end]
	 */
	private static int countHowManyPrimes(int start, int end) {
		int count = 0;
		
		for (int num = start; num <= end; num++) {
			if (isPrime(num)) {
				count++;
			}
		}
		
		return count;
	}

}
