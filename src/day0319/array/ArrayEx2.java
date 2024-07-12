package day0319.array;

public class ArrayEx2 {

	public static void main(String[] args) {
		//A반 학생들의 성적을 저장하세요.
		//89, 76, 54, 79, 90
		
		//타입[] 배열 변수={89, 76, 54, 79, 90};
		int [] score = {89, 76, 54, 79, 90};
		System.out.println(score[3]);
		//선언된 시점과 저장시점이 다르면, {값목록}; 방식은 사용불가
//		int [] score2;
//		score2 = {89, 76, 54, 79, 90};
		//배열 뱐수 선언 후
		int [] score2;
		//new 타입[]{값 목록}; 배열 생성 후 저장
		score2 = new int[] {89, 76, 54, 79, 90};
		System.out.println(score2);
		
		
	}

}
