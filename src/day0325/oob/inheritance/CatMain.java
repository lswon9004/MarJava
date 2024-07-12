package day0325.oob.inheritance;

public class CatMain {

	public static void main(String[] args) {
		Cat cat1 = new Cat("나비","코숏",5);
		
		System.out.println(cat1.toString());
		System.out.println(cat1);
		//print()/printIn() -> 참조형 변수 출력시 toString()호출, 리턴값 출력
		
		Dog d1 = new Dog("멍멍이", "말티즈",3.5,2);
		System.out.println(d1);
	}

}
