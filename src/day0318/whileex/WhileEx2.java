package day0318.whileex;

import java.util.Scanner;

public class WhileEx2 {
//while : 반복 회수가 정해져 있지 않았을 경우
	public static void main(String[] args) {
		//남은 좌석 : 5
		//기차표 구입 : (y/n)
		Scanner s = new Scanner(System.in);
		int seatSize = 5;
		while(seatSize!=0) {
			System.out.print("기차표 구입(y/n) > ");
			char yn = s.next().charAt(0);
			//s.next() : 입력한 문자열(String) 가져와서
			//String ==char 가 모여 있는 것
			//charAr(0) 문자열에서 제일 첫번째 글자만 가져온다.
			if (yn=='Y') {
				System.out.println("좌석을 구입하였습니다.");
				seatSize--;
			}else {
				System.out.println("구입을 취소하였습니다.");
			}//if

		}//while
		System.out.println("판매완료");
	}

}
