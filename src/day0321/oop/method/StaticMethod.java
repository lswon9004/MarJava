package day0321.oop.method;

public class StaticMethod {
	
	static int cv;//static 변수
	int iv;//instance 변수
	
	int iv2=cv;//instance 변수는 static 멤버를 사용할 수 있다.
	int iv3=iv;//instance 변수는 instance 멤버를 사용할 수 있다.
	
	static int cv2 = cv;//static 변수는 static 멤버를 사용할 수 없다.
//	static int cv3 = iv;//static 변수는 instance 멤버를 사용할 수 잆다.
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
	}
	static void staticMethod() {
//		System.out.println(iv);
		System.out.println(cv);
		//인스턴스 멤버를 사용하고 싶다면 객체를 생성해서 사용
		StaticMethod sm = new StaticMethod();
		System.out.println(sm.iv);
	}
}
