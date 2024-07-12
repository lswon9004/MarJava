package day0327.oop.poly;

public class InstanceofEx {
	public static void method(Object ob) {//모든 타입의 객체를 받아올 수 있다.
		if (ob instanceof Car) {//전달 받은 객체가 Car객체거나 Car자손객체
			((Car)ob).drive();//Car 객체에 있는 모든 멤버 사용할 수 있도록 Car타입으로 변환
			System.out.println("Object -> Car");
		}
		if (ob instanceof String) {
			char c =((String)ob).charAt(0);
			System.out.println("첫 번째 글자 : "+c);
			System.out.println("Object -> String");
		}
	}
	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
		Car car = new Car();
		
		method(car);
		method("JAVA");
		
		if (fe instanceof Car) {
			Car c1 = (Car)fe;
			System.out.println("Car타입 변환 가능");
		}
		if (car instanceof FireEngine) {
			FireEngine fe1 = (FireEngine)car;
			System.out.println("FireEngine타입 변환 가능");
		}else {
			System.out.println("FireEngine타입 변환 불가능");
		}
		
	}

}
