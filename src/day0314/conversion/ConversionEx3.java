package day0314.conversion;

public class ConversionEx3 {

	public static void main(String[] args) {
		int i1 = 100;
		double d1 = i1;
		float f = i1;
		
		System.out.println("d1 : "+ d1);
		System.out.println("f : "+ f);
		System.out.println("i1 : "+i1);// 메모리에 저장된 값은 변하지 않음
		
		//double -> int
		//실수 -> 정수 : 소수점자리 모두 버림
		double d2 = 3.14;
		int i2 = (int)d2;
		int i3 = (int)3.1415;
		
		System.out.println("d2 : "+d2);
		System.out.println("i2 : "+i2);
		System.out.println("i3 : "+i3);
		
		double d3 = 100.;
		//int i4 = 100.;
		
		System.out.println("d3 : "+d3);
	}

}
