package day0327.oop.poly;

public class DynamicBinding {
//Binding : 변수나 메서드의 주소를 결정하는 것
	public static void main(String[] args) {
		Child c = new Child();// static binding : 정적인 바인딩
							  //커파일 시점에 바인딩되서 고정된다.
		System.out.println(c.x);
		c.method();
		
		Parent p = new Child();//다형성
		System.out.println(p.x);//정적바인딩 : 참조변수 타입으로 결정
		p.method();//동적 바인딩 : 다형성으로 객체를 다룰때
				   //인트턴스 메서드 호출시 실행시점에 타입이 결정된다.
				   //실제 참조하고 있는 인스턴스의 타입을 따라간다.
		
		p.sMethod();//정적바인딩 : 참조변수 타입으로 결정
		
		Parent.sMethod();
		Child.sMethod();
		
	}

}
