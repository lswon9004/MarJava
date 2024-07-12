package day0325.oob.inheritance;

import java.util.Arrays;


public class Class {
	int grade;
	int className;
	Student[] stdents;
	Teacher teacher;
	
	public Class() {
	}

	public Class(int grade, int className, Student[] stdents, Teacher teacher) {
		this.grade = grade;
		this.className = className;
		this.stdents = stdents;
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return grade +"학년 "+className+"반 "+teacher+"\n"+Arrays.toString(stdents);//teacher의 toString으로 나와서 연산
	}

	public static void main(String[] args) {
		

		Student[] s = new Student[5];
		Teacher t = new Teacher("김자바", "남", "PYTHON");
		s[0] = new Student("김메리", "여", 1);
		s[1] = new Student("이메리", "남", 2);
		s[2] = new Student("최자바", "남", 3);
		s[3] = new Student("윤오라클", "남", 4);
		s[4] = new Student("김파이", "여", 5);

		Class c = new Class(1, 1, s, t);
		System.out.println(c);

		
	}

}
