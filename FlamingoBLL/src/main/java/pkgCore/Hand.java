package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();

	public Hand() {

	}

	public int[] ScoreHand() {
		int[] iScore = new int[2];
		Collections.sort(cards);

		for (Card c : cards) {
			switch (c.geteRank().getiRankNbr()) {
			case 14:
				if (iScore[1] > 10) {
					iScore[1] += 1;
					iScore[0] += 1;
				} else {
					iScore[0] += 1;
					iScore[1] += 11;
				}
				break;
			case 10: case 11: case 12: case 13:
				iScore[0] += 10;
				iScore[1] += 10;
				break;
			case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
				iScore[0] += c.geteRank().getiRankNbr();
				iScore[1] += c.geteRank().getiRankNbr();
				break;
			}
		}
		// highest number under 22 gets placed in index 0 of iScore
		if (iScore[0] == 21) {
			
		} else if (iScore[1] == 21) {
			int a = iScore[1];
			iScore [1] = iScore[0];
			iScore[0] = a;
		} else if (iScore[0] < iScore[1]) {
			if (iScore[1] > 21) {
				
			} else {
				int a = iScore[1];
				iScore [1] = iScore[0];
				iScore[0] = a;
			}
		}
		return iScore;
	}

	public void Draw(Deck d) {
		cards.add(d.draw());
	}

	private void AddCard(Card c) {
		cards.add(c);
	}

}
