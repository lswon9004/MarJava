package day0402.exam;

public class Exercise2 {
	public static String delCahr(String src, String delch) {
		String src1=src;
		for (int i=0; i<delch.length();i++) {
			char ch =delch.charAt(i);
			char ch1='\0';
			if (src.indexOf(ch)!=-1) {
				src1 = src1.replace(ch, ch1);
			}
		}
		return src1 ;
	}
		public static void main(String[] args) {
			System.out.println("(1!2@3^4~5)"+" -> "+delCahr("(1!2@3^4~5)", "~!@#$%^&*()"));
			System.out.println("(1 2 3 4\t5)"+" -> "+delCahr("(1 2 3 4\t5)", " \t"));
		}

	}
