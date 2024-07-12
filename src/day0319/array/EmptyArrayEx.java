package day0319.array;

public class EmptyArrayEx {

	public static void main(String[] args) {
		char [] arr = {};//EmptyArray
		
		System.out.println(arr.length);
		System.out.println(arr);//""
		
		int [] arr2 = {0};// 크기가 1인 배열 생성, 0값 하나 저장
		System.out.println(arr2.length);
		for (int i:arr2) {
			System.out.println(i);
		}
	}

}
