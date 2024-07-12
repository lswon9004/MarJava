package day0329.exception;

@SuppressWarnings("serial")
public class IdFormayException extends Exception {
	public IdFormayException(String message) {
		super(message);
		System.out.println("id 저장시 문제 발생");
	}

}
