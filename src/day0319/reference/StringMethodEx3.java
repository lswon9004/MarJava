package day0319.reference;

public class StringMethodEx3 {
//String간 크기 비교 : compareTo() 사용
	public static void main(String[] args) {
		//공백 숫자 대문자 소문자 한글 (사전) 순
		String str1 = "ABZ";
		String str2 = "ABZ";
		
//		boolean b = str1 > str2;//부등호 연산자는 숫자만 가능
		
		int i = str1.compareTo(str2);
		if (i==0) {
			System.out.println("두 글자는 같습니다.");
		}else if (i>0){//양수하면 첫번째
			System.out.println(str1+ "이/가 "+str2+" 보다 큽니다.");
		}else if (i<0) {
			System.out.println(str2+ "이/가 "+str1+" 보다 큽니다.");
		}
	}

}
