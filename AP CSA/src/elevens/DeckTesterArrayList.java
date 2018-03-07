package elevens;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTesterArrayList {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		/*String[] ranks = {"jack", "queen", "king"};
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

		 */
		List<String> cardRanks;
		cardRanks = new ArrayList<String>();
		cardRanks.add("ace");
		cardRanks.add("king");
		cardRanks.add("queen");
		cardRanks.add("jack");
		cardRanks.add("10");
		cardRanks.add("9");
		cardRanks.add("8");
		cardRanks.add("7");
		cardRanks.add("6");
		cardRanks.add("5");
		cardRanks.add("4");
		cardRanks.add("3");
		cardRanks.add("2");
		
		List<String> cardSuits;
		cardSuits = new ArrayList<String>();
		cardSuits.add("diamonds");
		cardSuits.add("spades");
		cardSuits.add("clubs");
		cardSuits.add("hearts");
		
		List<Integer> cardPointValues;
		cardPointValues = new ArrayList<Integer>();
		for (int i = 11; i >=2; i--)
		{
			cardPointValues.add(i);
			
			if (i == 10)
			{
				cardPointValues.add(i);
				cardPointValues.add(i);
				cardPointValues.add(i);
		

			}
		}
		
		
		DeckArrayList cardDeck = new DeckArrayList(cardRanks, cardSuits, cardPointValues);
		System.out.println(cardDeck);
		
	}
}
