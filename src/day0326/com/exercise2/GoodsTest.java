package day0326.com.exercise2;

import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		
		Goods goods = new Goods();

		Scanner s = new Scanner(System.in);
		System.out.println("다음의 값을 입력하시오.");
		System.out.print("상품명 : ");
		goods.setName(s.nextLine());
		
		System.out.print("가격 : ");
		goods.setPrice(s.nextInt());
		
		System.out.print("수량 : ");
		goods.setQuantity(s.nextInt());
		int result = goods.getPrice()*goods.getQuantity();

		System.out.println();
		System.out.println("입력된 결과는 다음과 같습니다.");
		System.out.println(goods);
		System.out.println("총 구매 가격 : "+ result);

	}

}
