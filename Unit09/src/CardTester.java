/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card test = new Card("5", "hearts", 5);
		System.out.println(test);
		
		Card test2 = new Card("5", "hearts", 5);
		System.out.println(test2);
		
		System.out.println(test.matches(test2));
		
		
	}
}
