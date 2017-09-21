package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {

		// Build a deck(1), make sure there are 52 cards in the deck
		int a = 0;
		Deck d = new Deck(1);
		for (int i = 0; i < 53; i++) {
			if (d.draw() == null) {
				assertTrue(a == 52);
			} else {
				a++;
			}
		}

		// Build a deck(6), make sure there are 312 cards in the deck
		int b = 0;
		Deck c = new Deck(6);
		for (int i = 0; i < 313; i++) {
			if (c.draw() == null) {
				assertTrue(b == 312);
			} else {
				b++;
			}
		}

	}

}
