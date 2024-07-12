package day0326.modifiler;

abstract class A {// 추상클래스
	abstract void move();// 추상메서드
}

class B extends A{ //일반클래스에서 추상클래스를 상속받아 오버라이딩함

	@Override
	void move() {
		System.out.println("B에서 오버라이딩함");
	}
}

public abstract class AbtractTest {

	public static void main(String[] args) {
		//A a = new A();
		B b = new B();
		
		b.move();
	}

}


