package day0403.exam;

import java.util.ArrayList;
import java.util.List;

public class PalindromeEx {
	boolean palindrome(String str) {
//		boolean result;
//		for(int i=0; ;i++) { // i < str.length()
//			if(i==str.length()) {
//				result = false;
//				break;
//			}
//			if ((str.charAt(i) == str.charAt(str.length() - i-1))) {
//				result = true;
//			}
//			else {
//				result = false;
//				break;
//			}
//		}
//		return result;
		if (str.length()==0) return false;
		StringBuilder srr = new StringBuilder();//역순 문자열 저장공간
		for (int i=(str.length());i>0;i--){
			srr.append(str.charAt(i-1));
		}
		return str.equals(srr.toString());
	}

	public static void main(String[] args) {
		PalindromeEx p = new PalindromeEx();
		String str = "";
		boolean result = p.palindrome(str);
		if (result) {
			System.out.println(str+"은 회문 문자열입니다.");
		}else {
			System.out.println(str+"은 회문문자열이 아닙니다.");
		}
		
	}
}
