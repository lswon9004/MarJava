package day0318.whileex;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		// 남은 좌석 : 5
		// 기차표 구입 : (y/n)
		Scanner s = new Scanner(System.in);
		int seatSize = 5;
		
		while (true) {
			System.out.print("기차표 구입(y/n) > ");
			char yn = s.next().charAt(0);
			//입력값이 Y거나 t이면 좌석 판매
			// N혹은 n이면 구매취소
			// 그외 나머지 경우라면 "잘못입력" 출력
			if (yn=='y' ||yn=='Y') {
				System.out.println("좌석 판매");
				seatSize--;
			}else if(yn=='n'||yn=='N') {
				System.out.println("구매취소");
			}else {
				System.out.println("잘못 입력");
			}
			if (seatSize==0) {
				break;
			}
		} // while
		System.out.println("판매완료");
	}

}
