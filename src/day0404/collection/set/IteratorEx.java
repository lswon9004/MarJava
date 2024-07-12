package day0404.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx {

	public static void main(String[] args) {
//Iterator : 컬렉션(List/Set)에 저장된 객체들을 하나씩 꺼내는 방법을 표준화
		List<String> list = Arrays.asList("J","A","V","A");
		Set<String> set = new HashSet<String>(list);
		
		Iterator<String> iter2 = set.iterator();// 반복자 - 컬렉션 원본데이터를 가리킨다.
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
			iter2.remove();
		}
		System.out.println(set.size());

	}

}
