package day0319.array;

import java.util.Arrays;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 100, 98, 100, 88, 90
		// 5개의 성적의 총점 평균 최대값, 최소값

		int[] score = { 100, 98, 100, 88, 90 };
		int sum = 0;
		int max = score[0];
		int min = score[0];
		double avg = 0.0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
		}
		avg = (double) sum / score.length;
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.printf("평균값 : %.2f\n", avg);
		System.out.println("총점  : " + sum);
		
		//오름차순 정렬 - 작은놈 ->큰놈순 :메모리에 저장된 배열내 순서를 변경
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));//배열 안에 있는 내용을 한줄(문자열)로 꺼내옴
		//int[] 변수 출력시 -> 배열 타입@배열주소(16진수)
		
	}

}
