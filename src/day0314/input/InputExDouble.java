package day0314.input;

import java.util.Scanner;

public class InputExDouble {

	public static void main(String[] args) {
		//원의 반지름을 입력 받아서 원의 크기를 구하시오.(반지름*반지름*파이)
		final double PI =3.14;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름 > ");
		double radius = scan.nextDouble();
		
		System.out.println("원의 크기 : "+(radius*radius*PI));
	}

}
