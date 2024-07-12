package day0325.oob.inheritance;

public class Dog extends Animal{
	
	int age;
	
	Dog(){}
	Dog(String name,String breeds,double weight,int age){
		super(name, breeds, weight);
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
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + ", breeds=" + breeds + ", weight=" + weight + "]";
	}
	
}
