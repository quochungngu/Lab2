package pkgCore;

import java.util.ArrayList;

import javax.smartcardio.Card;

public class Deck {

	//	TODO: Add 'cards' attribute that ArrayList<E>ayList of Card
	private ArrayList<Card> cardsInDeck;
	
	
	//	TODO: Add a contructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).
	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank: eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
	}
	
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc
	
	//			Deck(2) will create an array of 104 cards.
	
	
	//	TODO: Add a draw() method that will take a card from the deck and
	//			return it to the caller
	public Card Draw() {
		
		return cardsInDeck.remove(0);
	}
}
