package day0325.oob.inheritance;

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;// 변수 재정의

	void method() {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}

public class ChildMain {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}
