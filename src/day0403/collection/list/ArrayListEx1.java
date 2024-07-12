package day0403.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>(5);
		list1.add(1);
		list1.add(2);
		list1.add(8);
		list1.add(0);
		list1.add(9);
		list1.add(24);
		list1.add(3);
		
		System.out.println(list1);//toString()
		System.out.println("size : "+list1.size());
		System.out.println();
		
		list1.add(2, 9);
		System.out.println(list1);//toString()
		System.out.println("size : "+list1.size());
		System.out.println();
		
		list1.set(2, 5);
		System.out.println(list1);//toString()
		System.out.println("size : "+list1.size());
		System.out.println();
		
		List<Integer> list2 = list1.subList(1, 3);//리스트 일부 추출
		System.out.println(list2);
		
		System.out.println(list1.get(0));
		
		for (int i = 0 ; i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("-------------------");
		for (int i : list1) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		
		Collections.sort(list1);//원본 리스트 정렬(오름차순)
		System.out.println(list1);
		
		System.out.println(list1.remove(2));//index
		System.out.println(list1);
		//컬랙션 생성, 저장, 사용, 삭제
		
	}

}
