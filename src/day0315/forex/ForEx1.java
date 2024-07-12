package day0315.forex;

import java.util.List;

public class ForEx1 {

	public static void main(String[] args) {
		//for (초기식; 조건식; 증감식){반복할 수행문}
		//0~9까지 10번 반복하는 for
		//for (int i =0; i<= 9; i++) {
		//	System.out.println("i : "+i);
			
		//}//for
		//0~99까지 100번 반복하는 for
		//for (int i=0; i<=99; i++) {
		//	System.out.println("i : "+i);
		//}
		//1~100의 합을 구하는 for
		int hap = 0 ;
		int i = 1;
		for (; i<101; i++) {
			hap += i;
		}
		System.out.println(hap);
		System.out.println(i);
		//for 영역에 선언된 변수는 for안에서만 사용할 수 있음
		//메모리에 올라간 변수는 for반복이 끝나면 소멸한다.
		
		
	}//main

}
