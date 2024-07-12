package day0319.array;

public class ArrayEx1 {

	public static void main(String[] args) {
//		int[] a= new int[7];
//		for (int i=0;i<a.length; i++) {
//			a[i] =i;
//			System.out.println(a[i]);
//		}
//	'j', 'a', 'v', 'a',
		char[] carr=new char[4];//char데이터를 저장할 수 있는 4칸 배열
		carr[0] = 'j';
		carr[1] = 'a';
		carr[2] = 'v';
		carr[3] = 'a';
		//carr[4] = 'A';//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4 at day0319.array.ArrayEx1.main(ArrayEx1.java:17)
		//배열은 한번 만들어지면 크기가 고정된다.(인덱스의 범위를 넘어가면 Exception 발생) 
		char c = carr[0];
		System.out.println("carr[0] : "+c);
		//for : 배열의 전체 디에터 출력 0~ 배열의 크기(배열변수.length) 
		for (int i =0;i<4;i++) {
			System.out.println(carr[i]);
		}
		for (int i =0;i<carr.length;i++) {
			System.out.println(carr[i]);
		}
		System.out.println("carr.length : "+carr.length);
		
		System.out.println(carr);
	}

}
