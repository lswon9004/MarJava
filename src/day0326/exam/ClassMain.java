package day0326.exam;


public class ClassMain {

	
	public static void main(String[] args) {
		
		Teacher t = new Teacher("김자바", "남", "PYTHON");
		
		Student[] s = new Student[5];
		s[0] = new Student("김메리", "여", 1);
		s[1] = new Student("이메리", "남", 2);
		s[2] = new Student("최자바", "남", 3);
		s[3] = new Student("윤오라클", "남", 4);
		s[4] = new Student("김파이", "여", 5);
		Class c = new Class(1, 1, s, t);
		
		System.out.println(c);

	}

}
