package day0329.exception;

@SuppressWarnings("serial")
public class OverException extends Exception {
	
	public OverException(int score) {
		super("입력한 점수가 100보다 큽니다. : "+score);
	}

}
