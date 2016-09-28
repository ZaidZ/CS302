package recursion;

/**
 * Demonstrates how to recursively check whether a given string is a palindrome,
 * i.e. reads the same from both left and right direction.
 * 
 * A word like abcdcba is a palindrome.
 * The process for that example looks like:
 * 	1) result = isPalindrome("abcdcba")
 * 	2) result = isPalindrome("bcdcb")
 * 	3) result = isPalindrome("cdc")
 * 	4) result = isPalindrome("d")
 * 	5) result = true
 * 
 * A word like abxddcba is NOT a palindrome.
 * 	1) result = isPalindrome("abxddcba")
 * 	2) result = isPalindrome("bxddcb")
 * 	3) result = isPalindrome("xddc")
 * 	4) result = false
 * 
 * @author Zaid
 *
 */
public class StringRecursion {
	public static void main(String[] args) {
		String word = "anavolimilovana";
		
		System.out.println(isPalindrome(word));
	}

	private static boolean isPalindrome(String word) {
		// BASE CASE 1 - The word has one letter OR is empty => means it is a palindrome
		if (word.length() < 2) {
			return true;
		}
		
		// Get the first and last letter of the word
		char leftMost = word.charAt(0);
		char rightMost = word.charAt(word.length() - 1);
		
		// BASE CASE 2 - If the letters are not the same then it CANNOT be a palindrome
		if (leftMost != rightMost) {
			return false;
		}
		
		// Create a new string WITHOUT the first and last letter
		String newWord = word.substring(1, word.length() - 1);
		
		// Continue recursion
		return isPalindrome(newWord);
	}
}
