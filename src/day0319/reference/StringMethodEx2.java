package day0319.reference;

public class StringMethodEx2 {

	public static void main(String[] args) {
		String filename = "hello.java";
		int index = filename.indexOf(".");//5
		
		String name = filename.substring(0,index);
		String ext = filename.substring(index+1);
		
		System.out.println("filename : "+filename);
		System.out.println("파일명 : "+name);
		System.out.println("확장자 : "+ext);
		
		int index2 = "ABCDE".indexOf("D");
		if (index2==-1) {
			System.out.println("찾는 문자열이 없습니다.");
		}else {
			System.out.println("Z는 "+(index2+1)+"번째에 있습니다.");
		}
		String oldstr = "자바 문자열은 불변입니다. 자바문자열은 String클래스로 표현합니다.";
		String newstr = oldstr.replace("자바", "JAVA");
		
		System.out.println(newstr);
		System.out.println(oldstr);
		
		String a ="a";
		String b ="b";
		
		a+=b;
		System.out.println(a);
		System.out.println(b);
	}

}
