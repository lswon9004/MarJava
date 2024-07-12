package day0315.ifex;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 서울 지하철 기본 요금은 1400원이고
		// 어린이(0~13세 이하)라면 500
		// 청소년(14~20세 이하)라면 800
		// 경로(65세 이상)라면 0원 입니다
		System.out.println("나이를 입력하세요 > ");
		int age = s.nextInt();
		int fee = 500;
		String st = "어린이";
		if (age >= 0) {
			if (age >= 65) {
				System.out.println("무료입니다.");
			} else if (age > 20) {
				System.out.println("기본요금 1400원입니다.");
			} else if (age >= 14) {
				System.out.println("청소년 요금 800원입니다.");
			} else {
				System.out.println("어린이 요금 500원입니다.");
			}
		} else {
			System.out.println("나이를 잘못 입력하셨습니다.");
		}
		if (age >= 0) {
			if (age >= 65) {
				fee = 0;
				st = "경로";
			} else if (age > 20) {
				fee = 1400;
				st = "기본";
			} else if (age >= 14) {
				fee = 800;
				st = "청소년";
			}
			System.out.printf("%s 요금은 %d원 입니다.", st, fee);

		} else {
			System.out.println("나이를 잘못 입력하셨습니다.");
		}
	}

}
