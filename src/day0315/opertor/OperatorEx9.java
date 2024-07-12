package day0315.opertor;

public class OperatorEx9 {

	public static void main(String[] args) {
		// 변수 a에 저장된 값이 홀수라면 "odd", 짝수라면 "even"을 출력한다.
		int a =12; 
		
		String result =  a%2 == 0 ? "even" : "odd";
		System.out.printf("%d은/는 %s입니다.",a,result);
		// 선언 변수 = 조건식 ? 참일때 수행 : 거짓일때 수행 ;
		
		a = 10;
		int b = 10
				;
		String s = (a !=b) ? ((a>b) ? "a가 더 큼" : "b가 더 큼") : "a와 b는 같음";
		System.out.println(s);
	}

}
