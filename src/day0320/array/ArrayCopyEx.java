package day0320.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		int[]i1= {1,2,3,4,5};
		int[] copy = new int [10];
		
		System.arraycopy(i1, 0, copy, 0, 5);
		System.out.println(Arrays.toString(i1));
		System.out.println(Arrays.toString(copy));
		
		copy[5] = 100;
		System.out.println(Arrays.toString(i1));
		System.out.println(Arrays.toString(copy));
		
		int[]copy2=i1.clone();//똑같은 배열 객체가 하나 더 생성
		System.out.println(Arrays.toString(copy2));
		
		copy2[4]=10;
		System.out.println(Arrays.toString(i1));
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(copy2));
		
		}

}
