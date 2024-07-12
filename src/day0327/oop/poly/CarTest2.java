package day0327.oop.poly;

public class CarTest2 {

	public static void main(String[] args) {
		Car car = new Car();
		FireEngine fe = null;
		
		if (car instanceof FireEngine) {
			fe = (FireEngine)car;// error
			fe.drive();
			
		}else {
			System.out.println("변환 안됨");
		}
		
	}

}
