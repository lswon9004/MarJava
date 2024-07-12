package day0404.collection.set;

import java.util.TreeSet;

import day0403.collection.set.Member;

public class MemberTreeSet {

	public static void main(String[] args) {
		Member m1 = new Member(1, "김자바");
		Member m2 = new Member(2, "안디비");
		Member m3 = new Member(2, "안디비");
		Member m4 = new Member(4, "강대니얼");
		
		TreeSet<Member> members = new TreeSet<Member>();
		members.add(m3);
		members.add(m4);
		members.add(m1);//class day0403.collection.set.Member cannot be cast to class java.lang.Comparable 
		members.add(m2);
		
		
		System.out.println(members);
	}

}
