package day0314.operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		//<,> 연산자는 숫자만 가능
		int i = 10;
		int j = 11;
		System.out.println(i < j);
		System.out.println(i > j);

		i++;
		
		System.out.println(i == j);
		System.out.println(i != j);
		
		String s1 = "ABC";
		String s2 = "ABC";
		
//		System.out.println(s1 < s2);
		System.out.println(s1 != s2);
		System.out.println(s1 == s2);// 동등비교 연산자는 모든 타입에 사용 가능


	}

}
