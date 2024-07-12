package day0314.input;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		//새로운 스캐너 생성
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해 보세요 >");
		//값 입력 후 엔터키 누를 때 까지 기다렸다가
		//엔터가 입력되면
		//값을 읽어와(String) int로 변경한다.
		int demical = scan.nextInt();//숫자만 입력해야 한다.
		System.out.println("입력한 값 : "+demical);
		
	
	}

}
