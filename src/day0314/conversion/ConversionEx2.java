package day0314.conversion;

public class ConversionEx2 {

	public static void main(String[] args) {
		short s1 = 10;
		short s2 = 20;
		
		int s3 = s1 + s2;
		short s4 = (short)(s1+s2);
		
		System.out.println(s3);
		System.out.println(s4);

		System.out.println('A'+'B');//'A' : 65, 'b' : 66//131
		System.out.println("A"+"B");// 이어쓰기 AB
		System.out.println("ABCD"+'B');// AB String 은 문자열 => char가 여러개 있는 모양
	}

}
