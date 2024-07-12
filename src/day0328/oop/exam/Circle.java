package day0328.oop.exam;

public class Circle {
	private double radius;
	private final double PI=3.14;
	
	
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getPI() {
		return PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius *PI;
	}
}
