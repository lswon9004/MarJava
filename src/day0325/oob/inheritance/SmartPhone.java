package day0325.oob.inheritance;

public class SmartPhone extends Phone {
	
	
	public boolean wifi;

	public void wifi() {
		wifi = !wifi;
	}

	public void internet() {
		if (wifi) {
			System.out.println("인터넷 사용");
		} else {
			System.out.println("wifi 연결 안됨");
		}
	}
	
}
