package day0326.exam;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(20, 55);
		
		
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		
		t.setMinute(70);
		t.setHour(25);
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
}
}