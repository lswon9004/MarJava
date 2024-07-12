package com.test;

public class Food {
	private int price;
	private int point;

	public Food() {}

	public Food(int price) {
		this.price = price;
		point = price / 10;
	}

	public String getName() {
		return "Food";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	

}
