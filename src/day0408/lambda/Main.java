package day0408.lambda;

@FunctionalInterface // -> 람다식으로 구현할 수 있는 인터페이스
interface A {
	int max(int i, int j);
}

class Main {
	public static void main(String[] args) {

		A a = (i,j) -> (i > j) ? i : j ; // max 오버라이딩 한 A 구현 객체 생성
		System.out.println(a.max(100, 20));

	}
}
