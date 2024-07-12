package day0322.exam;

public class Cat {
	String name;
	String breeds;
	double weight;

	Cat() {
	}

	Cat(String name, String breeds, double weight) {
		this.name = name;
		this.breeds = breeds;
		this.weight = weight;
	}

	void claw() {
		System.out.println("할퀴기");
	}

	void meow() {
		System.out.println("야옹");
	}
}
