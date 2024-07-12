package day0321.oop.variable;

public class Card {
//멤버변수는 기본값으로 자동 초기화된다.
	static int width;
	static int height;
	
	String kind;
	int num;
	
	Card(){}
	Card(String k, int n){
		//객첵에 생성된 인스턴스 변수에 값을 저장.
		kind=k;
		num=n;
	}
	
	void printCard() {
		System.out.printf("카드의 크기 : %d, %d\n종류는 %s, %d\n",width, height, kind, num);
	}

}
