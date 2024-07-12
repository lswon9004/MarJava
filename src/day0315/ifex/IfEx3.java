package day0315.ifex;

public class IfEx3 {

	public static void main(String[] args) {
		//다중조건 if(조건){...}else if(조건){...}else{...}
		//조건이 참이면 그 영역만 수행하고 빠져나온다.
		int score = 99;
		char grade = 'A';
		
		if(score>=90) {
			grade = 'A';
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70){
			grade = 'C';
		}else {
			grade = 'F';
			System.out.println("공부 좀 합시다.");
		}// if end
		System.out.println("학점은 "+grade+" 입니다.");
	}
	

}
