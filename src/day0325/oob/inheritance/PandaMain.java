package day0325.oob.inheritance;

public class PandaMain {

	public static void main(String[] args) {
		Panda p1 = new Panda("푸바오","자이언트 판다",100,3);
		
		
		p1.play();
		p1.eat();
		System.out.println(p1.toString());
		System.out.println(p1);
	}

}
