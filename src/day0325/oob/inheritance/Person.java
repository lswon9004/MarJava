package day0325.oob.inheritance;

public class Person {
	String name;
	String gender;
	Person() {}
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	//객체가 가지고 있는 값들을 하나의 문자열로 만드는 용도
	@Override
	public String toString() {
		return "이름 : " + name + ", 성별 : " + gender;
	}
	
}
