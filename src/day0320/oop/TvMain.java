package day0320.oop;

public class TvMain {

	public static void main(String[] args) {
		Tv t =new Tv();
		//Tv타입의 변수는 Tv클래스로 생성된 객체의 주소값만 저장할 수 있다.
		//new: 메모리에 주소를 할당 박아서 클래스 내 맴버를 인스턴스화한다.
		//80 inch, model : ss24, channel : 10, power : off
		t.inch = 80;
		t.model="ss24";
		t.channel = 10;
		t.power = false;
		
		t.power();
		System.out.println(t.power);
		
		t.chUp();
		System.out.println(t.channel);
		
		
	}

}
