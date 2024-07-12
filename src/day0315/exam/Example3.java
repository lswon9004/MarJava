package day0315.exam;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 > ");
		int a = scan.nextInt();

		System.out.print("숫자 > ");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println(a - b);
		} else
			System.out.println(b - a);

	}

}
