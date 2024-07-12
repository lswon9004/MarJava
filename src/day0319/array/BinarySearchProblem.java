package day0319.array;

public class BinarySearchProblem {
//	바이너리 서치 - 이진탐색 (binary search)
//	정렬된 자료를 반으로 나누어 탐색하는 방법
//	주의점 : 자료는 오름차순 으로 정렬된 자료여야 한다.
//  사용되는 대표적인 예시로 정렬된 배열에서 특정 값 이상 또는 초과인 원소가 등장하는 처음 위치를 찾는 문제
	public static void main(String[] args) {
		int[] numbers = { 12, 25, 31, 48, 54, 66, 70, 83, 95, 108 };

		int target = 55   ; // 찾고자 하는 값

		int left = 0;
		int right = numbers.length - 1; //9
		int mid = (left + right) / 2; // 4

		int temp = numbers[mid];
		boolean find = false; // false : 못찾음. true : 찾음

		while (left <= right) {

			if (target == temp) { // 수를 찾은 경우
				find = true;
				break;
			} else if (target < temp) { // 찾으려는 수가 더 작은 경우
				right = mid - 1;

			} else {
				left = mid + 1;
			}
			mid = (left + right) / 2;
			temp = numbers[mid];
		}

		if (find == true) {
			mid++;
			System.out.println("찾는 수는 " + mid + "번째 있습니다.");
		} else
			System.out.println("찾는 수가 없습니다.");
	}

}
