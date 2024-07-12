package day0327.oop.modifier;

public class Singleton {
	
	private static Singleton s =  new Singleton();
	int x;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (s==null) {
			s = new Singleton();
		}
		return s;
	}
	
}
