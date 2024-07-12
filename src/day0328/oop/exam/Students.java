package day0328.oop.exam;

public class Students {
	private String name;
	private String grade;
	private int money;
	
	public Students(String name, String grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	public void takeBus(Bus b) {
		money  = money - b.getCharge();
		
	}
	
}
