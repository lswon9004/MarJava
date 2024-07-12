package day0314.exam;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("밑변 > ");
		double a = scan.nextDouble();
		
		System.out.print("높이 > ");
		double b = scan.nextDouble();
		
		double c = (a*b)/2;
		
		System.out.println("삼각형의 넓이 : "+c);
		
		

	}

}
