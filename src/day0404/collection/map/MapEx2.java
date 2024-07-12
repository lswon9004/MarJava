package day0404.collection.map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		// key : id, value : password 저장
		map.put("myid", "1234");
		map.put("asdf", "1111");
		map.put("poi", "1234");

		// 키보드로 id와 password를 입력받아 저장해둔 데이터와 일치 한다면 "로그인 성공" 출력후 종료,
		// 아니면 다시 로그인 하는 코드로 돌아간다.

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("아이디 입력 > ");
			String id = scan.next();
			System.out.print("password > ");
			String password = scan.next();

			if (!map.containsKey(id)) {
				System.out.println("입력한 아이디는 없습니다. 다시입력하세요.");
				continue;
			} else if (password.equals(map.get(id))) {
				System.out.println(id+"님 로그인 성공");
				break;
			}else {
				System.out.println("password와 id가 같지 않습니다.다시입력하세요.");
			}

		}

	}
}
