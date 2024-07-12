package day0327.exam;

import java.util.Scanner;

public class SawonMain {
	public static void main(String[] args) {
		Sawon[] s= new Sawon[3];
		s[0]= new Sawon("A1892","이진선","AI개발부","사원",3500);
		s[1]= new Sawon("B8077","심용권","Web개발부","부장",7000);
		s[2]= new Sawon("F5691","신지영","총괄개발부","전무",9000);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("사원번호 > ");
		String st = scan.next();
		
		int count=0;//찾은 사원 수
		
		for (Sawon sa: s) {
			if(st.equalsIgnoreCase(sa.getNo())) {
				System.out.println(sa);
				count++;
				break;
			}
		}
		if (count==0) {
			System.out.println("검색한 사원은 없습니다.");
		}
	}

}
