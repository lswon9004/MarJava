package day0313.print;

public class Exam2 {

	public static void main(String[] args) {
		// = :오른쪽 값을 왼쪽 변수에 대입(저장)한다.
		int x = 3;
		int y = 5;
		int z = 10;
		int temp = x;// x가 가지고 있는 데이터를 임시로 저장
		x = z;
		z = y;
		y = temp;
		 
		System.out.println("x : " + x +", "+ "y : " + y + ", z : "+ z);
		System.out.printf("X : %d, y : %d, z : %d", x, y, z);
	}

}