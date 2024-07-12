package day0313.variable;

public class ConversionEx {

	public static void main(String[] args) {
		//int + int = int
		int num1 = 2100000000;
		int num2 = 2100000000;
		
		System.out.println(num1+num2);// 오버플로우 발생
		System.out.println((long)num1+num2);//\|

	}

}
