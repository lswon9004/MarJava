package day0314.operator;

public class OperationEx3 {

	public static void main(String[] args) {
		//산술연산자 : int, long, float, double, cahr, byte, short만 사용 가능
		//'+'만 추가로 String 타입 연산(이어쓰기) 가능
		int v1 = 5;
		int v2 = 2;
		
		System.out.println("v1 + v2 : "+(v1+v2));
		System.out.println("v1 - v2 : "+(v1-v2));
		System.out.println("v1 * v2 : "+(v1*v2));
		System.out.println("v1 / v2 : "+(v1/v2)); // 2.5-> 2 
		System.out.println("(double)v1/ v2 : "+(double)v1/v2);//소수점 자리가 남아있음
		System.out.println("(double)(v1/ v2) : "+(double)(v1/v2));//소용없음

		System.out.println("v1 % v2 : "+(v1%v2));
		
		// "ABC" - "abc";

	}

}
