package day0318.whileex;

import java.util.Scanner;

public class WhileEx4 {
//bank -1.예금 2. 출금 3. 잔액조회 4.종료
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int balance = 0;//잔액
		boolean run =true;
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 2. 출금 3. 잔액조회 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택 > ");
			int yn = s.nextInt();

			if(yn==1) {
				System.out.println("예금을 시작합니다.");
				System.out.print("예금액을 입력해주세요 > ");
				int i = s.nextInt();
				balance = balance +i;

			}else if (yn==2) {
				System.out.println("출금을 시작합니다.");
				System.out.print("출금액을 입력해주세요 > ");
				int i = s.nextInt();
				if (balance<i) {
					System.err.println("잔액이 부족합니다.");
					System.out.println("출금할 수 없습니다.");
				}else {
					balance = balance - i;
					System.out.println("출금이 완료되었습니다.");

				}

			}else if (yn ==3) {
				System.out.println("잔액을 조회합니다.");
				System.out.println("잔액 : "+balance);
				
			}else if (yn==4) {
				run =false;
				System.out.println("서비스 종료되었습니다.");
				
			}else {
				//하는 일 없이 while 반복
			}//if end
		}//while end
	}

}
