package day0328.oop.exam;

public class Subway extends Drfss {
	private String subwayNumber;

	public Subway() {
	}

	public Subway(int charge, String subwayNumber) {
		super(charge);
		this.subwayNumber=subwayNumber;
	}

	public String getSubwayNumber() {
		return subwayNumber;
	}

	public void setSubwayNumber(String subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	

}
