package day0403.collection.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		Stack<String> name = new Stack<String>();
		name.push("김자바");
		name.push("김자숙");
		name.push("안자바");
		name.push("노자바");
		
		for (String s: name) {
			System.out.println(s);
		}//순서 유지 : list 구현하고 있음
		System.out.println("---------------");
		System.out.println(name.peek());//제일 위에 있는 객체 가져옴(삭제x)
		System.out.println("---------------");
		while (!name.empty()) {
			System.out.println(name.pop());//제일 위에 있는 객체 삭제하면서 가져옴
		}
		System.out.println("---------------");
		Queue<String> q= new LinkedList<String>();
		q.offer("김자바");
		q.offer("김자바");
		q.offer("안자바");
		q.offer("노자바");
		for (String s: q) {
			System.out.println(s);
		}
		System.out.println("---------------");
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
