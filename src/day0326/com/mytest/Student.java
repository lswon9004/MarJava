package day0326.com.mytest;

public class Student extends Person {
	private int id;

	public Student() {
	}

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return super.toString() + " 학번 : " + id;
	}

	@Override
	void print() {
		System.out.println(toString());
	}

}
