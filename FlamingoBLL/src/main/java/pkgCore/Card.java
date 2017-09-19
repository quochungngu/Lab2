package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	private int eRank;
	private Suit eSuit;
	
	public Card(int eRank, Suit eSuit) {
		this.eRank = eRank;
		this.eSuit = eSuit;
	}
	 
	public int getERank() {
		return eRank;
	}
	public Suit getESuit() {
		return eSuit;
	}

	private void setERank(int eRank) {
		this.eRank;
		
	}
	private void setESuit(Suit eSuit) {
		this.eSuit;
		
	}
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());

}
	
}
