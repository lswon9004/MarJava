package day0318.whileex;

import java.util.Scanner;

public class BreakEx1 {

	public static void main(String[] args) {
		//숫자 맟추기 게임
		//정답을 random으로 만들고 입력값과 비교해서 맟출때 까지 입력받는다.(1~10)
		Scanner s = new Scanner(System.in);

		int answer =(int)(Math.random() * 10)+1;
				// (0.0~1.0) * 10      (int)(0.0~10.0)   (0~9)+1 =>1~10
		//
		while(true) {
			System.out.print("1~10사이의 숫자를 맟춰 보세요 > ");
			int input = s.nextInt();
			
			if (answer==input) {
				System.out.println("정답입니다.");
				break;
			}else if (answer>input) {
				System.out.println("up");			
			}else {
				System.out.println("down");
			}
		}
		System.out.println("END");
		
	}

}
