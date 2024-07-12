package com.test;

public class CustomerMain {

	public static void main(String[] args) {
		Cusmtomer b = new Cusmtomer();
		Noodle nd = new Noodle();
		Rice rc = new Rice();
		
		b.order(nd);
		b.order(rc);
		
		System.out.println(b);
	}

}
