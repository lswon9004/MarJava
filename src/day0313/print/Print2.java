package day0313.print;

public class Print2 {

	public static void main(String[] args) {
		//System.out.printf("포맷할 문자열", 값, ..);
		System.out.printf("내용1\n내용2\n");
		System.out.printf("내용3");//\n 줄바꿈 ln
		System.out.println();
		
		//%형식을 사용해 값을 받아와 포샛한다.
		//%d : 정수, %s : 문자열, %c : char, %f : 실수
		System.out.printf("%d * %d = %d\n", 2, 5, 10);
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		System.out.printf("%05d\n", 123);
		System.out.println();
		System.out.printf("%f\n", 123.456);//소수점 6자리까지 출력
		System.out.printf("%.2f\n", 123.456);//소수점 2자리까지 반올림해서 출
		System.out.printf("%10.2f\n", 123.456);//
		System.out.println();
		System.out.printf("%4s\n", "김자바");
		System.out.printf("%4s\n", "남궁자바");




	}

}
