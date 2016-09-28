package loops;

/**
 * A demonstration on the three basic types of loops doing the exact same thing,
 * i.e. printing numbers from 1 to 9.
 * 
 * @author Zaid
 *
 */
public class LoopsInJAVA {

	public static void main(String[] args) {
		int i = 1;
		while (i < 10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		
		int j = 1;
		do {
			System.out.print(j + " ");
			j++;
		} while (j < 10);
		
		System.out.println();
		
		for (int k = 1; k < 10; k++) {
			System.out.print(k + " ");
		}
	}

}
