package day0318.forex;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 원하는 구구단의 단수를 입력 받으면 행당 단을 출력한다.
		// 5를 입력하면 5단 출력
		Scanner s = new Scanner(System.in);
		System.out.print("단을 입력하세요 >");

		int dan = s.nextInt();
		System.out.println(dan + "단\n---------------------");

		for (int j = 1; j < 10; j++) {
			int k = j * dan;
			System.out.printf("%d x %d = %d\n", dan, j, k);
		}
		System.out.println("-----------");
		for (int j = 9; j > 0; j--) {
			int k = j * dan;
			System.out.printf("%d x %d = %d\n", dan, j, k);
		}
		System.out.println("-----------");

		for (int i = 1; i<10;i++) {
			for (int j = 1; j< 10;j++) {
				int k = i * j;
				System.out.printf("%d x %d = %d\n", i, j, k);
			}//inner for
			System.out.println("-----------");
		}//outer for

	}
}
