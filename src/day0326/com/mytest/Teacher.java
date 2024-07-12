package day0326.com.mytest;

public class Teacher extends Person {
	private String subject;

	public Teacher() {
	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return super.toString() + " 과목 : " + subject;
	}
	@Override
	void print() {
		System.out.println(toString());
	}
}
