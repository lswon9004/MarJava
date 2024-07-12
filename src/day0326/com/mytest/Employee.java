package day0326.com.mytest;

public class Employee extends Person {
	private String dept;

	public Employee() {}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + " 부서 : " + dept;
	}

	@Override
	void print() {
		System.out.println(toString());
	}

}
