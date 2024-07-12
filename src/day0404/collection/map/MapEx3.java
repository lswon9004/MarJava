package day0404.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx3 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("김자바", 90);
		map.put("이자바", 100);
		map.put("강자바", 100);
		map.put("안자바", 80);
		map.put("노자바", 70);

		Set<String> set = map.keySet();
		System.out.println("참가자 명단 : " + set);

		Collection<Integer> values = map.values();
		Iterator<Integer> it2 = values.iterator();

		int sum = 0;

		while (it2.hasNext()) {
			sum += it2.next();
		}

		int max = Collections.max(values);
		int min = Collections.min(values);
//Value값으로 key를 찾아야 하는 경우
		Set<Entry<String, Integer>> set2 = map.entrySet();
		Iterator<Entry<String, Integer>> it = set2.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> e = it.next();
			if (max == e.getValue()) {
				System.out.println("최고점수 - 이름 : " + e.getKey() + ", " + "점수 : " + e.getValue());
			}
			if (min == e.getValue()) {
				System.out.println("최저점수 - 이름 : " + e.getKey() + ", " + "점수 : " + e.getValue());
			}

		} // while
		System.out.println("총점 : " + sum);
		System.out.println("평균  : " + (float) sum / values.size());

	}

}
