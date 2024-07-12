package day0318.exam;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자을 입력하세요 >");
		int num = s.nextInt();

		int sum = 0;

		while (num>0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
//		for(;num!=0;num /=  10)
//			sum += (num % 10);
		System.out.println(sum);
		System.out.println(num);
	}

}
