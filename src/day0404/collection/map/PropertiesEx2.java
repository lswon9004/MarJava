package day0404.collection.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesEx2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 프로퍼티스 파일 내용을 key와 value로 저장할 공간
		Properties p = new Properties();
		String path = "data.properties";// 프로젝트 폴더에 만들었으면 파일명만...
//new FileinputStream(path
		p.load(new FileInputStream(path));

		p.list(System.out);
		// 학생의 이름, 총점, 평균 출력
		
		String[] str = (p.getProperty("score").split(","));
		int sum = 0;
		for (String s : str) {
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
		double avg = ((double) sum) / str.length;
		System.out.printf("%.2f\n",avg);
		System.out.println(p.getProperty("name"));

	}

}
