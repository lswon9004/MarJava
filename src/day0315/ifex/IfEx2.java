package day0315.ifex;

public class IfEx2 {

	public static void main(String[] args) {
		int i = 10;//10
		String str = "50미만입니다.";
		
		if (i > 50) {
			str = "50이상";
		}
		System.out.println(i+" : "+str);
	}

}
