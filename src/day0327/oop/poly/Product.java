package day0327.oop.poly;

public class Product {
	int price;
	int bonus;

	public Product(int price) {
		this.price = price;
		bonus = price / 10;
	}

}
