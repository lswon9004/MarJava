package day0327.oop.poly;

public class Store {

	public static void main(String[] args) {
		 Tv tv = new Tv(); 
		 Computer com = new Computer();
		 
		 Buyer b = new Buyer();
		 
		 b.buy(tv);
		 b.buy(com);
		
		 System.out.println("남은 잔액 : "+b.money);
		 System.out.println("bonus : "+b.bonus);
	}

}
