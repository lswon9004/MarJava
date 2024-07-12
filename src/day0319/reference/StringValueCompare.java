package day0319.reference;

public class StringValueCompare {

	public static void main(String[] args) {
		// ==변수가 가지고 있는 값을 비교. 참조형은 주소를 비교한다.
		int i =10;
		int j =11;
		
		System.out.println(i==j);
		
		String s1 ="ABC";
		String s2 ="ABC";

		System.out.println(s1==s2);
		
		String s3 =new String("ABC");
		String s4 =new String("ABC");
		
		System.out.println(s3==s4);
		
		System.out.println(s3.equals(s4));
		//문자열1.equals(문자열2):
		//문자열1이 가리키고 있는 문자열과 문자열2가 가리키고 있는 문자열을 비교


	}

}
