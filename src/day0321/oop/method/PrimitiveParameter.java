package day0321.oop.method;

public class PrimitiveParameter {//기본형 매개 변수
	
	static void change(int i) {
		i=1000;
		System.out.println("x : "+i);//1000
	}

	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		
		change(d.x);
		System.out.println("d.x : "+d.x);//10
	}

}
