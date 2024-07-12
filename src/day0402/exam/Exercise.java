package day0402.exam;

public class Exercise {
public static String delCahr(String src, String delch) {
	StringBuilder buffer = new StringBuilder(src.length());
	for (int i=0; i<src.length();i++) {
		char ch =src.charAt(i);
		if (delch.indexOf(src.charAt(i))==-1) {
			
			buffer.append(ch);
			
		}
	}
	return buffer.toString();
}
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+" -> "+delCahr("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)"+" -> "+delCahr("(1 2 3 4\t5)", " \t"));
	}

}
