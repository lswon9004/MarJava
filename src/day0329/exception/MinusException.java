package day0329.exception;

@SuppressWarnings("serial")
public class MinusException extends Exception {
	
	public MinusException() {
		super("입력한 점수가 음수입니다.");
	}
	public MinusException(int score) {
		super("입력한 점수가 음수 입니다. : "+score);
	}
}
