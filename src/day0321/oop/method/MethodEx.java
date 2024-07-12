package day0321.oop.method;

public class MethodEx {
	//int, long, 타입의 두개의 값을 받아서 더한 결과를 리턴하는 add메서드 선언
	long add(int a, long b) {
		long result = a+b;
		return result;
	}
	//int, int 받아서 곱하고 결과를 리턴하는 multuply
	double multuply(int i, int j) {
		int result = i*j;
		return result;
	}
	//double, double 받아서 나누고 결과 리턴하는 divide
	double divide(double d, double d1) {
		double result = d/d1;
		return result;
	}
	//두개 문자열 받아서 더하고 출력 후 리턴하지 않는 addString
	void addString(String s, String s2) {
		System.out.println(s+s2);
		if (s.equals("EXIT")) {
			return;
		}
		System.out.println(s+s2);

	}
	
}
