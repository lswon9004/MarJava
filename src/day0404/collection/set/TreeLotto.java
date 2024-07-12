package day0404.collection.set;

import java.util.TreeSet;

public class TreeLotto {

	public static void main(String[] args) {
		
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		while(lotto.size()<6) {
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
		}
		System.out.println(lotto);
	}

}
