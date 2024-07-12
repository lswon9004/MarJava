package day0321.oop.method;

public class CallStackEx {
	static void first() {
		second();
	}

	static void second() {
		System.out.println("run");
	}

	public static void main(String[] args) {
		first();
	}
}
