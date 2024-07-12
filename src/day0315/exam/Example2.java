package day0315.exam;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 > ");
		int year = scan.nextInt();
		String st = "아닙";
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					st = "맞습";
				}
			} else {
				st = "맞습";
			}
		}
		System.out.printf("윤년이 %s니다.", st);

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			st = "맞습";
		}
		System.out.println();
		System.out.printf("윤년이 %s니다.", st);

	}

}
