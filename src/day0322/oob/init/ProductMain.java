package day0322.oob.init;

class Product {

	static int count; // 단 한번 초기화 되는 static 변수
	int serialNo; // 제품 고유 번호(id)
	String name;//제품명
	{
		++count;
		serialNo = count;
	} //인스턴스 초기화 블럭을 잘 사용하지는 않지만..
	//생성자들이 공통으로 수행해야 하는 문장이 있다면 {}을 사용한다.	
	
	Product(){
		name = "무제";
	}
	Product(String name){
		this.name = name;
	}
}

public class ProductMain {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product("TV");
		Product p3 = new Product();
		
		System.out.println("p1.serialNo : "+p1.serialNo);
		System.out.println("p2.serialNo : "+p2.serialNo);
		System.out.println("p3.serialNo : "+p3.serialNo);
	}

}
