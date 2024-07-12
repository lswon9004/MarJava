package day0319.array;

public class ForEachEx1 {

	public static void main(String[] args) {
		//향상된 for문 : 배열의 전체 데이터를 하나씩 꺼내와서 처리 한다.
		//for (변수 선언 : 배열){반복할 실행문}
		int[] num = {1, 5, 3, 6, 7, 2, 4};
		for (int i:num) {
			System.out.println(i);
		}
		String [] sarr = {"AA", "b", "CC", "DD"};
		for (String str : sarr) {
			System.out.println(str);
		}
		char [] ch = {'A', 'B', 'c'};
		for (char c : ch) {
			System.out.println(c);
		}
	}

}
