package day0321.oop.variable;

public class CardMain {

	public static void main(String[] args) {
		// w: 100, h: 250, K: "HEART" n: 7
		// w: 100, h: 250, K: "CLOVER" n: 10

		Card.width = 100;
		Card.height = 250;

		Card c1 = new Card();

		c1.kind = "HEART";
		c1.num = 7;

		c1.printCard();

		Card c2 = new Card();

		c2.kind = "CLOVER";
		c2.num = 10;

		c2.printCard();
		
		System.out.println("c1.w : 300, c1.h : 500 after");
		c1.width=300;
		c1.height=500;

		c1.printCard();
		c2.printCard();
		Card c3=new Card("HEART",6);
		c3.printCard();
		
	}

}
