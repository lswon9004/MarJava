package day0404.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class SearchActor {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Map<String, String[]> actor = new HashMap<String, String[]>();

		actor.put("송강호", new String[] { "브로커", "택시운전자", "기생충" });
		actor.put("김수현", new String[] { "도둑들", "드림하이", "은밀하게 위대하게", "눈물의 여왕" });
		actor.put("이병헌", new String[] { "남산의 부장들", "콘크리트 유토피아", "광해" });
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("검색할 배우 : ");
			String str = s.next();

			if (actor.containsKey(str)) {
				System.out.println("[" + str + "]");
				for (String st : actor.get(str)) {
					System.out.println(st);
				}
				break;
			} else {
				System.out.println("해당배우가 존재하지 않습니다.");
			}
		}
		Properties p = new Properties();
		String path = "actors.properties";
		p.load(new FileInputStream(path));
		System.out.print("검색할 배우 : ");
		String str = s.next();
		if (p.containsKey(str)) {
			System.out.println("[" + str + "]");
			for (String st : p.getProperty(str).split(",")) {
				System.out.println(st);
			}
		}else {
			System.out.println("해당배우가 존재하지 않습니다.");
		}
	}
}
