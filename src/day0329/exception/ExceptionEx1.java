package day0329.exception;

public class ExceptionEx1 {
	public static void main(String[] args) {
		int [] iarr = {10, 200, 30};
		
		for (int i=0; i<=iarr.length;i++) {
			try {
			System.out.println(iarr[i]);
			}catch (ArrayIndexOutOfBoundsException aie) {
				System.out.println("예외발생");
			}
		}
		
		System.out.println("program end!!");
	}
}
