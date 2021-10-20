package workshop2;

public class DeckOfCards {
	/**
	public class DeckOfCards 
	{
		/*
		 * Array Declaration for suits and ranks
		 */
		static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		static int numOfCards = suits.length * ranks.length;
		static String[] deck = new String[numOfCards];

		public void initializeDeck() {
			/*
			 * initialize deck
			 */
			for (int i = 0; i < ranks.length; i++) {
				for (int j = 0; j < suits.length; j++) {
					deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
				}
			}


		}

		public static void main(String[] args) {
			DeckOfCards obj = new DeckOfCards();
			obj.initializeDeck();

		}
}
	 