package day0314.exam;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("윗변 > ");
		double a = scan.nextDouble();
		
		System.out.print("밑변 > ");
		double b = scan.nextDouble();
		
		System.out.print("높이 > ");
		double c = scan.nextDouble();
		
		double d = (a+b)*c/2;
		
		System.out.println("사디리꼴의 넓이 : "+d);
	}

}
