package com.test;

public class Cusmtomer {
	private int money=10000;
	private int point;
	
	public void order(Food f) {
		if (money< f.getPrice()) {
			System.out.println("주문 불가");
			return;
		}
			System.out.println(f.getName()+"을/를 주문하셨습니다.");
			money -=f.getPrice();
			point +=f.getPoint();
		
	}

	@Override
	public String toString() {
		return "현재 남은 돈은" + money + "원 입니다.\n현재 보너스 점수는 " + point + "점 입니다.";
	}
	
}
