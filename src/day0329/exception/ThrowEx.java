package day0329.exception;

public class ThrowEx {

	public static void main(String[] args) {
		try {
			throw new Exception("강제 예외 발생");

		} catch (Exception e) {
			System.out.println(e.getMessage());// 예외 객체 메서드
			e.printStackTrace();// 예외 추적 메서드
		}
		System.out.println("program end!!");
	}

}
