package day0319.array;

import java.util.Arrays;

public class ArrayEx5 {
	public static void main(String[] args) {
		int[] nums = new int[45];

		for (int i = 1; i <= 45; i++) {
			nums[i - 1] = i;
		}

		for(int i = 0; i < 10000; i++) {
			int r = (int)(Math.random() * 45); // 0 ~ 44
			int temp = nums[0];
			nums[0] = nums[r];
			nums[r] = temp;
		}
		System.out.println(Arrays.toString(nums));
		for(int j = 0; j < 6; j++) {
			System.out.println(nums[j]);
		}
		System.out.println();
		int i=(int)(Math.random()*10);
		int j=(int)(Math.random()*100)+1;
		System.out.println(i);
		System.out.println(j);
	}

	
}

