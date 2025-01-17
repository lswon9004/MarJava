package day0329.exception;

public class Score {
	int score;

	public void checkScore(int score) throws MinusException, OverException {
		if (score < 0) {
			throw new MinusException(score);
		} else if (score > 100) {
			throw new OverException(score);
		}
		this.score = score;
		System.out.println("점수 저장");
	}

	public static void main(String[] args) {
		Score score = new Score();
		try {
			score.checkScore(58);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("점수 : "+score.score);
	}
}
