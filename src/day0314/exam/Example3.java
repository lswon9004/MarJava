package day0314.exam;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		final int D = 534;
		final int E = 30;
		
		int f = D/E;
		int g = D%E;
		System.out.println("학생들이 가지는 연필의 수 : "+f);
		System.out.println("남은 연필의 수 : "+g);	
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생들의 수 : ");
		int a = scan.nextInt();
		
		System.out.print("연필의 수 > ");
		int h = scan.nextInt();
		
		int b = D / a;
		int c = D % a;
		
		System.out.println("학생들이 가지는 연필의 수 : "+b);
		System.out.println("남은 연필의 수 : "+c);
	}

}
