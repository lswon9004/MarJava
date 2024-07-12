package day0326.exam;

public class Card {
	final int number;
	final String kind;
	
	public Card(int number, String kind) {
		this.number = number;
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Card [number=" + number + ", kind=" + kind + "]";
	}
	
	
}
