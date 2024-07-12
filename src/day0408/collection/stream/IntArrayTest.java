package day0408.collection.stream;

import java.util.Arrays;

public class IntArrayTest {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		int sumValue = Arrays.stream(arr).sum();
		long count =  Arrays.stream(arr).count();
		int min = Arrays.stream(arr).min().orElse(0);
		int max = Arrays.stream(arr).filter(n->n%2==0).max().orElse(100);
		
		System.out.println("최대값 : "+max);
		System.out.println("최솟값 : "+min);
		System.out.println("총합 : " + sumValue);
		System.out.println("갯수 : " + count);

		int sumValue2 = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
		System.out.println("총합2 : " + sumValue2);
	}

}
