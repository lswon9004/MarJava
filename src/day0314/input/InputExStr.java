package day0314.input;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import day0326.com.exercise2.Goods;

public class InputExStr {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요 > ");
		//화면의 키보드로 입력한 값 == String 타입
		String name = scan.next();//공백, tab을 기준으로 잘라내어(token) 단어 한개 가져옴
		
		System.out.println("이름 : "+ name);
		
		System.out.print("이름과 성을 뛰어서 입력하세요 > ");
		scan.nextLine();//먼저 입력한 엔터 처리
		String name2 = scan.nextLine();//공백을 포함한 한 줄 입력받음
		System.out.println("이름2 : "+name2);

	}

}
