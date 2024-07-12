package day0326.modifiler;

public class FountainPen extends Ballpen{
	public void refill(int n) {setAmount(n);}

	public FountainPen() {}

	public FountainPen(int amount, String color) {
		super(amount, color);
	}
	

}
