package day0328.oop.exam;

public class Whale extends Fish implements Mamal {

	@Override
	public void bear() {
		System.out.println("고래는 새끼를 낳습니다.");
	}

	@Override
	public void swim() {
		System.out.println("고래는 바다에서 수영을 합니다.");
	}

}
