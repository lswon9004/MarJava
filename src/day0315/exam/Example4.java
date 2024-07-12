package day0315.exam;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 > ");
		int a = scan.nextInt();

		System.out.print("숫자 > ");
		int b = scan.nextInt();

		System.out.print("숫자 > ");
		int c = scan.nextInt();
		int max = a;
		int mini = a;

		if (a > b) {
			if (a > c) {
				max = a;
				if (b > c) {
					mini = c;
				} else
					mini = b;

			} else {
				max = c;
				mini = b;
			}
		} else {
			if (a > c) {
				max = b;
				mini = c;
			} else {
				mini = a;
				if (b > c) {

				} else
					max = c;

			}
		}
		double d = (a + b + c) / 3.0;
		System.out.printf("입력값의 평균 : %.2f, 최대값 : %d, 최소값 : %d", d, max, mini);

		if (a > b && a > c && b > c) {
			max = a;
			mini = c;
		} else if (a > b && a > c && b < c) {
			max = a;
			mini = b;
		} else if (a < b && a > c && b > c) {
			max = b;
			mini = c;
		} else if (a < b && a < c && b > c) {
			max = b;
			mini = a;
		} else if (a < b && a < c && b < c) {
			max = c;
			mini = a;
		} else {
			max = c;
			mini = b;
		}
		if (max<b) max=b;
		if (max<c) max=c;
		
		if (mini>b) mini=b;
		if (mini>c) mini=c;
		
		System.out.println();
		System.out.printf("입력값의 평균 : %.2f, 최대값 : %d, 최소값 : %d", d, max, mini);

	}

}
