package day0322.oob.constructor;

public class Car1 {
	String color;
	String model;
	int door;
	

	public Car1() {}


	public Car1(String color, String model) {
		this.color = color;
		this.model = model;
	}


	public Car1(String color, String model, int door) {
		this(model, color);
		this.door = door;
	}


	void printCar() {
		System.out.println("model : "+model+" color : "+color+" door : "+door);
	}


}
