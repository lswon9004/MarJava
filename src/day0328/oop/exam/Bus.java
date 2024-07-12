package day0328.oop.exam;

public class Bus extends Drfss {
	private String busNumber;

	public Bus() {}

	public Bus(String busNumber, int charge) {
		super(charge);
		this.busNumber = busNumber;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	@Override
	public void showInfo() {
		System.out.println("버스 상태 출력");
	}
	
	
}
