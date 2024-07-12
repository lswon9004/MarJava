package day0320.array;

public class ArrayAddressEx {

	public static void main(String[] args) {
		String[] arr= {"a", "b", "c", "d"};
		String[] arr2= null;
		
		for (String s: arr) {
			System.out.println(s);
		}
		arr2= arr;//주소 값 복사
		arr2[0]="AAAA";
		
		System.out.println("arr2[0] 값 변경 후");
		for (String s: arr) {
			System.out.println(s);
		}
	}

}
