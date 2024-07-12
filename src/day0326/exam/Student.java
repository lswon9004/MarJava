package day0326.exam;

public class Student extends Person{
	
	int id;

	public Student() {}

	public Student(String name, String gender,int id) {
		super(name, gender);
		this.id=id;
	}

	@Override
	public String toString() {
		return  id+"번 " + super.toString()+"\n";
	}
		
}
class Teacher extends Person{
	
	String subject;
	
	public Teacher() {}

	public Teacher(String name, String gender,String subject) {
		super(name, gender);
		this.subject=subject;
	}

	@Override
	public String toString() {
		return name + " "+subject +" 교사" ;
	}

	
	
}
