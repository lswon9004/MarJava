package day0322.oob.constructor;

public class Car2 {
	String color;
	String model;
	int door;

	Car2() {

	}

	Car2(String color) {
		this("포르세",color,4);
	}
//지역 변수와 인스턴스 변수의 이름이 같을 때 
//지역 내에서는 지역변수가 우선권을 가진다.(변수명만 쓰면 지역변수를 가리킨다.
//this참조변수를 붙이면 객체 내 인스턴스 변수를 가리킨다.
	Car2(String model, String color, int door) {
		this.model = model;
		this.color = color;
		this.door = door;
	}
	
	void printCar() {
		System.out.println("model : "+model+" color : "+color+" door : "+door);
	}
}
