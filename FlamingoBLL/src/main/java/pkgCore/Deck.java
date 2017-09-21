package pkgCore;

import pkgEnum.*;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();


	public Deck(int NumDecks) {
		for (; NumDecks > 0; NumDecks--) {
			for (eRank eRank : eRank.values()) {
				for (eSuit eSuit : eSuit.values()) {
					cards.add(new Card(eSuit, eRank));
				}
			}
		}
		Collections.shuffle(cards);
	}

	
	public Card draw() {
		return cards.remove(0);
	}
}
