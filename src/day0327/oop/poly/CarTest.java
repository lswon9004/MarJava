package day0327.oop.poly;

public class CarTest {

	public static void main(String[] args) {
		 Car car = null;
		 FireEngine fe = new FireEngine();
		 FireEngine fe2 = null;
		 
		 car = fe;
		 car.drive();
		 ((FireEngine) car).water();
		 
		 fe2 = (FireEngine)car;
		 fe2.drive();
		 fe2.water();
	}

}
