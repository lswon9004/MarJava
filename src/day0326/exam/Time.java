package day0326.exam;

public class Time {

	private int hour;
	private int minute;
	private boolean am; // true면 am, false면 pm
	
	
	// 일반적으로 생성자의 접근제어자는 클래스의 접근제어자를 사용한다.
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

//캡슐화 : 데이터와 데이터를 처리하는 메서드를 결합해 선언한다.
//객체 외부에서는 객체 내 데이터를 직접 접근하지 못하고 정의된 메서드를 통해서만 접근할 수 있다.	
	// 변수에 값을 저장(setter)
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			return;
		}
		this.hour = hour;
	}
	// 변수가 가지고 있는 값을 리턴(getter)
	public int getHour(){
		return hour;
	}
	//boolean타입 setter/getter - 변수명 : am
	public void setAm(boolean am) {
		this.am = am;
	}
	//boolean타입의 getter => is+변수명
	public boolean isAm() {
		return am;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	
}





