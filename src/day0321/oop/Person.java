package day0321.oop;

public class Person {
	//모든 객체는 한국 국적으러 가지고 있음 nat
	static String nat= "KOREAN";
	
	String name;//인스턴스 변수
	int age;
	String job;
	char gender;

	void method() {
		System.out.printf("이름은 %s 이고 나이는 %d세이고 직업은 %s, 국적은 %s, 성별은 %c입니다.\n", name, age, job,nat, gender);

	}
}
