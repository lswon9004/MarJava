package day0404.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		//이름이 붙어 있는 값 저장
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("severop", "192.168.0.1");
		map.put("port", "8080");
		map.put("query", "name=kim");
		
		System.out.println(map);
		//똑같은 key로 저장하면 value값을 변경한다.
		map.put("port", "8088");
		System.out.println(map);
		
		System.out.println(map.get("port"));
		System.out.println(map.get("test"));//없는 키 -> null
		
		Set<String> keys = map.keySet();
		
		Iterator<String> kiter = keys.iterator();
		while(kiter.hasNext()) {
			String k = kiter.next();
			String v = map.get(k);
			System.out.printf("%s의 값은 %s입니다\n",k,v);
		}
	}

}
