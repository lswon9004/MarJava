package day0401.argsmethod;

public class VarArgsMrthod {
//	public String appendString(String sa, String s2) {
//		return sa + s2;
//	}
//	public String appendString(String sa, String s2, String s3, String s4) {
//		return sa+ s2 +s3 + s4;
//	}
	//가변 인수 메서드- 매개변수의 개수가 정해져 있지 않음
	//			 - 전달 받은 값들을 배열화 시킨다.
	//			 - 메서드 하나당 한번, 제일 마지막에 적용한다.
	public  String appendString(int i,String...str) {
		String result = "";
		for (String s : str) {
			result+=s;
		}
		return result;
	}
	public static void main(String[] args) {
		VarArgsMrthod vam = new VarArgsMrthod();
		String as1 = vam.appendString(1,"hello", "JAVA");
		String as2 = vam.appendString(2,"hello", " ", "JAVA", "!!");
		
		System.out.println(as1);
		System.out.println(as2);
	}

}
