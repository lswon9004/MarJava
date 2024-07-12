package day0328.oop.exam;

public class Cylimder {
	private Circle c;
	private double height;
	
	public Cylimder(Circle c, double height) {
		this.c = c;
		this.height = height;
	}

	public Circle getC() {
		return c;
	}

	public void setC(Circle c) {
		this.c = c;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return c.getArea()*getHeight();
	}
 
	
}
