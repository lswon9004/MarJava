package day0327.oop.poly;

public class Buyer {
 int money=1000;
 int bonus;
 
 public void buy(Product p) {
	 if (p.price> money) {
		 System.out.println("잔액 부족");
		 return;
	 }
	 money-=p.price;
	 bonus+=p.bonus;
	 System.out.println(p+"을/를 구입");
	 					//참조형.to
 }
}
