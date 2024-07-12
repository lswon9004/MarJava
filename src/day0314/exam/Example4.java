package day0314.exam;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력값 > ");
		int a = scan.nextInt();
		int b = (a / 100);
		int c = a%10;
		int d = (a /10)%10;
		System.out.println("백의 자리수 : " + b + ", 십의 자리수 : "+d+ ", 일의 자리수 : "+ c);


	}

}
