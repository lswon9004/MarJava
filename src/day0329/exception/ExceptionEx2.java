package day0329.exception;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int var = 50;

		try {
			int data = Integer.parseInt(args[0]);

			System.out.println(var / data);
		}catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("값을 입력하세요.");
		} catch (NumberFormatException | ArithmeticException nfe) {
			System.out.println("0이 아닌 숫자만 입력하세요.");
		} catch (Exception e) {
			System.out.println("예외 처리");
		} finally {
			System.out.println("무조건 실행");
		}
		System.out.println("program end!!");
	}
}
