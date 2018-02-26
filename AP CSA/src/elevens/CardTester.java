package elevens;

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
		Card card1 = new Card ("K", "Diamonds", 10);
		System.out.println(card1);
		
		Card card2 = new Card ("Q", "Spades", 10);
		System.out.println(card2);
		
		Card card3 = new Card ("9", "Clubs", 9);
		System.out.println(card3);
	}
}