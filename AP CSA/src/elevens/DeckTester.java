package elevens;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"diamonds", "spades"};
		int[] pointValues = {11,12,13};
		Deck deck1 = new Deck(ranks, suits, pointValues);
		
		String[] ranks2 = {"1", "2", "3"};
		String[] suits2 = {"clubs", "hearts"};
		int[] pointValues2 = {1,2,3};
		Deck deck2 = new Deck (ranks2, suits2, pointValues2);
		
		String[] ranks3 = {"4", "5", "6"};
		String[] suits3 = {"diamonds", "clubs"};
		int[] pointValues3 = {4,5,6};
		Deck deck3 = new Deck (ranks3, suits3,pointValues3);
		
	}
}
