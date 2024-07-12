package day0327.oop.poly;

public class Child extends Parent {
	int x = 200;

	@Override
	public void method() {
		System.out.println("Child 실행");//메서드 오버라이딩
	}
	//@Override - static 메서드 오버라이드 안됨
	//hiding : 부모클래스의 정적 메서드를 자식 클래스에서 똑같이 정의함으로써
	//		   부모클래스의 정적 메서드가 숨겨짐
	//클래스명.메서드명 호출시 새로 정의된 메서드 호출됨
	public static void sMethod() {
		System.out.println("Child static method");
	}
}
