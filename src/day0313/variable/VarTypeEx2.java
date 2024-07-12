package day0313.variable;

public class VarTypeEx2 {

	public static void main(String[] args) {
		//문자(한개) char(character)
		char c = 'A';//아스키 코드 65
		System.out.printf("c의 값 : %c\n", c);
		
		char c2 = 65;
		System.out.printf("c2의 값 : %c\n", c2);
		
		char c3 = '가';// 유니코드 utf-8
		char c4 = 44032;
		char c5 = '\uac00';//16진수 저장
		System.out.printf("%c, %c, %c", c3, c4, c5);
	}

	
	
	
	
}
