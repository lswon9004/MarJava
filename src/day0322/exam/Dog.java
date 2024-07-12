package day0322.exam;

public class Dog {
	String name;
	String breeds;
	double weight;
	int age;
	
	Dog(){}
	Dog(String name,String breeds,double weight,int age){
		this.name=name;
		this.breeds=breeds;
		this.weight=weight;
		this.age=age;
	}
	void bite() {
		System.out.println("물기");
	}
	void bark() {
		System.out.println("멍멍");
	}
	void wag() {
		System.out.println("꼬리치기");
	}
}
