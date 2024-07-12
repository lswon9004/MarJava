package day0408.lambda;

@FunctionalInterface // 람다로 구현할 수 있는 인터페이스 : 추상메서드가 한개만 !!!
interface MyFunction {
	void run();
	default void run2() {
		System.out.println("f1.run2()실행");
	}
}

@FunctionalInterface
interface MyNumber {
	int max(int x, int y);
}

public class LambdaEx1 {
	
	public static void main(String[] args) {
		
		int a = 10;
		MyFunction f1 = () -> System.out.println("f1.run()실행");// 구현 객체 생성
		MyNumber n1 = (x, y) -> {
			if (x >= y) {
//				a = 20;
				return x + a;//외부 클래스의 맴버를 자신의 멤버처럼 사용가능
			} else {
				return y;
			}
		};

		f1.run();
		f1.run2();
		System.out.println(n1.max(10, 12));
	} 

}
