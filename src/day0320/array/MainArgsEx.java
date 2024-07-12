package day0320.array;

public class MainArgsEx {
	// main : 프로그램 시작점
	public static void main(String[] args) {
		// -프로그램 시작시 필요한 값이 있다면
		// 값을 미리 전달 받아서 시작한다.
		// 전달 받은 값은 배열 생성해 args변수에 저장해 둔다.
		// 전당 받은 값 == argument(인자, 인수)

		if (args.length > 0) {
			for (String s : args) {
				System.out.println(s);
			}
			//필요한 값이 숫자라면 String -> int
			int i = Integer.parseInt(args[0]);
			System.out.println(i+10);
			//parseInt(String 데이터) -> 숫자로만 이루어진 문자열을 의미 그대로의 숫자로 바꿔준다.
			//Integer.parseInt("100")->100
		} else {//인수 값을 넣지 않으면 length가 0인 배열이 만들어진다.
			System.out.println("실행시 입력한 값이 없습니다.");
		}

	}

}
