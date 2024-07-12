package day0314.operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		int apple = 1;
		double piece = 0.1;
		int eatCount = 7;
		
		double result = apple - (piece*eatCount);
		System.out.println("남은 사과 : "+result);
		
		System.out.println(0.1+0.1+0.1);
		
		System.out.println("----------------");
		// 정확한 계산이 필요하다면 정수로 바꿔서 계산 후 다시 소수점을 붙인다.
		int apple1 = 1;
		int totalpiece = 10;
		int eatcount1= 7;
		
		double result1 = (totalpiece - eatcount1)/10.0;
		System.out.println("남은 사과 : "+result1);

		
	}

}
