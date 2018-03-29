package elevens;


import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard2 extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};


	/**
	 * The cards on this board.
	 */
	//private Card[] cards;

	/**
	 * The deck of cards being used to play the current game.
	 */
	//private Deck deck;

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	public ElevensBoard2() {
		/*cards = new Card[BOARD_SIZE];
		deck = new Deck(RANKS, SUITS, POINT_VALUES);
		if (I_AM_DEBUGGING) {
			System.out.println(deck);
			System.out.println("----------");
		}
		dealMyCards();*/
		//int size, String[] ranks, String[] suits, int[] pointValues
		
		
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
		/*cards = new Card[BOARD_SIZE];
		deck = new Deck(RANKS, SUITS, POINT_VALUES);
		if (I_AM_DEBUGGING) {
			System.out.println(deck);
			System.out.println("----------");
		}
		dealMyCards();*/
		System.out.println("Mitali Juneja\nPeriod 4\nMarch 28, 2018\nComputer 2");
	
	}

	/**
	 * Start a new game by shuffling the deck and
	 * dealing some cards to this board.
	 */
	/*public void newGame() {
		deck.shuffle();
		dealMyCards();
	}*/

	/**
	 * Accesses the size of the board.
	 * Note that this is not the number of cards it contains,
	 * which will be smaller near the end of a winning game.
	 * @return the size of the board
	 */
	/*public int size() {
		return cards.length;
	}
*/
	/**
	 * Determines if the board is empty (has no cards).
	 * @return true if this board is empty; false otherwise.
	 */
	/*public boolean isEmpty() {
		for (int k = 0; k < cards.length; k++) {
			if (cards[k] != null) {
				return false;
			}
		}
		return true;
	}/*

	/**
	 * Deal a card to the kth position in this board.
	 * If the deck is empty, the kth card is set to null.
	 * @param k the index of the card to be dealt.
	 */
	/*public void deal(int k) {
		cards[k] = deck.deal();
	}
*/
	/**
	 * Accesses the deck's size.
	 * @return the number of undealt cards left in the deck.
	 */
	/*public int deckSize() {
		return deck.size();
	}*/

	/**
	 * Accesses a card on the board.
	 * @return the card at position k on the board.
	 * @param k is the board position of the card to return.
	 */
	/*public Card cardAt(int k) {
		return cards[k];
	}*/

	/**
	 * Replaces selected cards on the board by dealing new cards.
	 * @param selectedCards is a list of the indices of the
	 *        cards to be replaced.
	 */
	public void replaceSelectedCards(List<Integer> selectedCards) {
		for (Integer k : selectedCards) {
			deal(k.intValue());
		}
	}

	/**
	 * Gets the indexes of the actual (non-null) cards on the board.
	 *
	 * @return a List that contains the locations (indexes)
	 *         of the non-null entries on the board.
	 */
	/*public List<Integer> cardIndexes() {
		List<Integer> selected = new ArrayList<Integer>();
		for (int k = 0; k < cards.length; k++) {
			if (cards[k] != null) {
				selected.add(new Integer(k));
			}
		}
		return selected;
	}
*/
	/**
	 * Generates and returns a string representation of this board.
	 * @return the string version of this board.
	 */
	/*public String toString() {
		String s = "";
		for (int k = 0; k < cards.length; k++) {
			s = s + k + ": " + cards[k] + "\n";
		}
		return s;
	}
*/
	/**
	 * Determine whether or not the game has been won,
	 * i.e. neither the board nor the deck has any more cards.
	 * @return true when the current game has been won;
	 *         false otherwise.
	 */
	/*public boolean gameIsWon() {
		if (deck.isEmpty()) {
			for (Card c : cards) {
				if (c != null) {
					return false;
				}
			}
			return true;
		}
		return false;
	}*/

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		/*for (int i = 0; i < selectedCards.size(); i++)
		{
			System.out.println(cardAt(selectedCards.get(i)));
		}*/
		
		int trueConditions = 0;
		if (containsPairSum11 (selectedCards))
		{
			trueConditions++;
		}
		
		if (containsThreeSum11 (selectedCards))
		{
			trueConditions++;
		}
		if (containsJQK (selectedCards))
		{
			trueConditions++;
		}
		if (containsPairFaceCards (selectedCards))
		{
			trueConditions++;
		}
		
		
		if (trueConditions >=1)
		{
			return true;
		}
		
		return false;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		
		List<Integer> cardIndex = cardIndexes();
		//System.out.println(containsPairSum11(cardIndex));
		//System.out.println(containsJQK(cardIndex));
		
		int trueConditions = 0;
		if (containsPairSum11 (cardIndex))
		{
			trueConditions++;
		}
		
		if (containsThreeSum11 (cardIndex))
		{
			trueConditions++;
		}
		if (containsJQK (cardIndex))
		{
			trueConditions++;
		}
		if (containsPairFaceCards (cardIndex))
		{
			trueConditions++;
		}
		if (trueConditions >=1)
		{
			return true;
		}
		return false;
	}


	/**
	 * Deal cards to this board to start the game.
	 */
	/*private void dealMyCards() {
		for (int k = 0; k < cards.length; k++) {
			cards[k] = deck.deal();
		}
	}*/

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
			
			int total2 = 0;
			int total3 = 0;
			for (int i = 0; i < selectedCards.size(); i++)
			{
				for (int j = 0; j < selectedCards.size(); j++)
				{
					if (i!=j)
					{
							total2 = cardAt(selectedCards.get(i)).pointValue() + cardAt(selectedCards.get(j)).pointValue();
							
							if (total2 == 11)
							{
								return true;
							}
					
						
					}
				}
			}
			
			
			
			
			
		
		return false;
	}
	
	private boolean containsThreeSum11 (List<Integer> selectedCards){
		int total3 = 0;
		for (int i = 0; i < selectedCards.size(); i++)
		{
			for (int j = 0; j < selectedCards.size(); j++)
			{
				for (int k = 0; k < selectedCards.size(); k++)
				{
					if (i != j && i != k && j !=k)
					{
						total3 = cardAt(selectedCards.get(i)).pointValue() + cardAt(selectedCards.get(j)).pointValue() + cardAt(selectedCards.get(k)).pointValue();
							
							if (total3 == 11)
							{
								return true;
							}
					
						
					}
				}
			}
		}
		
		return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		String[] c = new String[selectedCards.size()];
		for (int i = 0; i < c.length; i++)
		{
			c[i] = cardAt(selectedCards.get(i)).rank();
			
		}
		int jackCount = 0;
		int queenCount = 0;
		int kingCount = 0;
		
			for (int i = 0; i < c.length; i++)
			{
				if (c[i].equals("jack"))
				{
					jackCount++;
				}
				if (c[i].equals("queen"))
				{
					queenCount++;
				}
				if (c[i].equals("king"))
				{
					kingCount++;
				}

			}
			if (jackCount >=1 && queenCount >=1 && kingCount >=1)
			{
				return true;
			}

		return false;
		
	}
	
	private boolean containsPairFaceCards(List<Integer> selectedCards)
	{
		String[] c = new String[selectedCards.size()];
		for (int i = 0; i < c.length; i++)
		{
			c[i] = cardAt(selectedCards.get(i)).rank();
			
		}
		int jackCount = 0;
		int queenCount = 0;
		int kingCount = 0;
		
			for (int i = 0; i < c.length; i++)
			{
				if (c[i].equals("jack"))
				{
					jackCount++;
				}
				if (c[i].equals("queen"))
				{
					queenCount++;
				}
				if (c[i].equals("king"))
				{
					kingCount++;
				}

			}
			
			if (jackCount >=2 && queenCount >=0 && kingCount >=0)
			{
				return true;
			}
			
			if (jackCount >=0 && queenCount >=2 && kingCount >=0)
			{
				return true;
			}
			
			if (jackCount >= 0 && queenCount >=0 && kingCount >=2)
			{
				return true;
			}
		return false;
	}
}