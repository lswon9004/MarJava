package day0322.oob.init;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean run =true;
		Bank b = new Bank();
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
				
				b.deposit(i);
			}else if (yn==2) {
				System.out.println("출금을 시작합니다.");
				System.out.print("출금액을 입력해주세요 > ");
				int i = s.nextInt();
				
				b.withdraw(i); 

			}else if (yn ==3) {
				b.getBalance();
			}else if (yn==4) {
				run =false;
				System.out.println("서비스 종료되었습니다.");
				
			}
		}
	}

}
