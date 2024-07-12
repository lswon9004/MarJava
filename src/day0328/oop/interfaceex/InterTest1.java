package day0328.oop.interfaceex;

interface Aa{
	int A =100;//public static final
	int getA();//public : 인터페이스에 선언된 추상 메서드는 항상 public 메서드임!!!
}

public class InterTest1  implements Aa{
	
	@Override
	public int getA() {//public 필수
		return A;
	}

	public static void main(String[] args) {
		Aa a = new InterTest1();//구현 객체
		System.out.println(A);
		System.out.println(a.getA());//오버라이딩된 메서드 호출
	}

	
}
