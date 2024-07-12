package day0318.forex;

public class ForEx3 {
	public static void main(String[] args) {
		//for 증감식
		//0~10까찌 2식 증가하는 for문
		//int sum = 0;
		for (int i = 0; i < 11; i += 2) {
			//sum+=i;
			System.out.println(i);
			//System.out.println(sum);
		}
		//10에서 1까지 1씩  감소하는 for문
		for (int j = 10; j!=0;j--) {
			System.out.println("j : "+j);
		}
		//"hellp 5번 출력
		for (int k = 5; k>0;k--) {
			System.out.println("hello");
		}
	}
}
