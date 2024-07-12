package day0325.oob.inheritance;

public class Cat extends Animal{
	

	Cat() {
	}

	Cat(String name, String breeds, double weight) {
		super(name, breeds, weight);
	}

	void claw() {
		System.out.println("할퀴기");
	}

	void meow() {
		System.out.println("야옹");
	}
	//오버라이드 어노테이션 : 오버라이딩 된 메서드라고 알려주는 역활
	@Override
	public String toString() {
		return "이름 : "+name+", 품종 : "+breeds+", 무게 : "+weight;
	}
}
