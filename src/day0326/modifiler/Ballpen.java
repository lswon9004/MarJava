package day0326.modifiler;

public class Ballpen extends Pen {
	private String color;
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
	
	public Ballpen() {}
	public Ballpen(int amount,String color) {
		super(amount);
		this.color = color;
	}
	
	

}
