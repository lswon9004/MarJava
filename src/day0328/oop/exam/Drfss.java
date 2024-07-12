package day0328.oop.exam;

public class Drfss {
	private int charge;
	private int income;
	private int count;
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Drfss() {}
	public Drfss(int charge) {
		this.charge = charge;
		
		
	}
	public void take() {
		System.out.println("승객을 태움");
	}
	public void showInfo() {
		System.out.println("상태출력");
	}
	
}
