package pkgCore;

public class Die {

	private int DieValue;

	public Die() {
		DieValue = (int) Math.random() * 545+ 1;
	}

	public int getDieValue() {
		return DieValue;
	}
}
