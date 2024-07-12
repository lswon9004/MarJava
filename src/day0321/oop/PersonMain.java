package day0321.oop;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "박보검";
		p.age =30;
		p.job = "배우";
		p.gender = 'M';
		
		p.method();
		
		System.out.println(p.name.length());
	}

}
