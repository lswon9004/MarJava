package day0328.oop.exam;

public class CylinderTest {
	public static void main(String[] args) {
		Circle c = new Circle(2.8);
		Cylimder cy = new Cylimder(c, 5.6);
		
		System.out.printf("원통의 부피 : %.3f",cy.getVolume());
	}
}
