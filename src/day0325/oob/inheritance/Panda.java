package day0325.oob.inheritance;

public class Panda extends Animal {
	int age;

	Panda() {
	}

	Panda(String name, String breeds, double weight, int age) {
		super(name,breeds,weight);
		this.age = age;
	}

	@Override
	void eat() {
		System.out.println("대나무를 먹는다.");
	}

	@Override
	public String toString() {
		return "Panda [age=" + age + ", name=" + name + ", breeds=" + breeds + ", weight=" + weight + "]";
	}

	void play() {
		System.out.println("손으로 장남감을 잡고 논다");
	}
}
