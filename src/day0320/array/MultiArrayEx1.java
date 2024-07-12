package day0320.array;

import java.util.Arrays;

public class MultiArrayEx1 {

	public static void main(String[] args) {
		//2차원 배열 : 1차원 배열을 여러개 가지고 있다.
		//타입 [][] 변수명={{값목록},{값목록}}
		//타입[][] 변수명 +-= new 타입[1차원 배열의 수][2차원 배열의 크기];
		
		int[][] test = new int[2][3];
		test[0][0]=1;
		test[0][1]=2;
		test[0][2]=3;
		test[1][0]=4;
		test[1][1]=5;
		test[1][2]=6;
		
		for (int i =0;i < test.length ;i++) {
			for (int j =0; j<test[i].length;j++) {
				System.out.printf("test[%d][%d] : %d\n",i,j,test[i][j]);
			}
		}
		for (int[] i1:test) {
			for(int i2: i1) {
				System.out.println(i2);
			}
		}
	}

}
