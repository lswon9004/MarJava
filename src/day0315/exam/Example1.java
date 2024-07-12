package day0315.exam;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력값 > ");
		int a = scan.nextInt();
		if (a % 4 == 0) {
			System.out.println("4의 배수");
		} else
			System.out.println("4의 배수가 아닙니다.");
		
	}

}
