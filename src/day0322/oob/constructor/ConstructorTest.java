package day0322.oob.constructor;

class Data1 {
	Data1() {
	}// 기본생성자 추가

	int value;
}

class Data2 {
	int value;// 인스턴스 변수

	Data2() {
	}

	Data2(int x) {// 생성자
		value = x;
	}
}

public class ConstructorTest {
	ConstructorTest() {
	}// 기본 생성자 추가

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();
		Data2 d3 = new Data2(4);

	}

}
