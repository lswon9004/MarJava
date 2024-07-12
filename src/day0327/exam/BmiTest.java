package day0327.exam;

import java.util.Scanner;

public class BmiTest {
	public static void main(String[] args) {
		Bmi b = new Bmi();

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("BMI 계산기");
			System.out.println("============");
			System.out.print("키를 입력해주세요 : ");
			b.setLenghth(s.nextDouble()); 

			System.out.print("몸무게를 입력해주세요 : ");
			b.setWeight(s.nextDouble()); 

			System.out.printf("BMI 지수 : %.2f\n", b.mtdBMI());
			System.out.println("BMI 지수 : "+b);
			System.out.println();
		}
	}
}
