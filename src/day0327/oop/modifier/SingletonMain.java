package day0327.oop.modifier;

public class SingletonMain {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		s1.x=200;
		System.out.println(s1.x);
		
		Singleton s2 = Singleton.getInstance();
		s2.x =1000;
		System.out.println(s1.x);
		System.out.println(s2.x);
	}

}
