package day0321.oop.method;

public class ReturnTest {
	//같은 이름의 메서드라도 매개변수가 다르면 다른 메서드임!!!
	int add(int a, int b) {
		return a + b;
	}

	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}

	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();
		int result = r.add(3, 5);
		System.out.println("r.add(3, 5) = " + result);

		int[] result2 = { 0 };
		r.add(4, 9, result2);
		System.out.println("r.add(4, 9, result2) = " + result2[0]);
	}
}
