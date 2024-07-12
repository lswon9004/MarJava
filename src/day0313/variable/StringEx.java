package day0313.variable;

public class StringEx {

	public static void main(String[] args) {
		//String : 문자열을 표현
		String str = "문자열";
		String empty = "";//빈 문자열
		String blank = " ";//공백
		
		//문자열 결합 : String = String + String
		String s1 = "Ja";
		String s2 = "va";
		String s3 = s1 + s2;
		System.out.println(s3);

		//문자열과 숫자의 결합 : 숫자 + 문자열 : 타입이 다르기 때문에 자동으로 타입을 일치 시킨다.
		// 우선순위가 문자열이 높기 때문에 숫자가 문자열 처리된다.
		//100->"100"
		String s4 = s1 +100;
		System.out.println(s4);
		
		System.out.println(7+ " ");//"7 "
		System.out.println(" " +7);//" 7"
		System.out.println(7+ "");//"7" int-> String 변환시 : ""을 더해준다.
		System.out.println(""+7);//"7"
		System.out.println(7+ ""+7);//"77"
		System.out.println(""+7+7);//"77"
		System.out.println(7+7+ "");//"14"


	}

}
