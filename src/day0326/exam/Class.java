package day0326.exam;

import java.util.Arrays;


public class Class {
	int grade;
	int className;
	Student[] stdents;
	Teacher teacher;
	{className++;}
	
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
		return grade +"학년 "+className+"반 "+teacher+"\n"+
				Arrays.toString(stdents);//teacher의 toString으로 나와서 연산
	}
}
