package day0328.oop.interfaceex;

class A3{
	void methodA() {
		I3 i = InstanceManager.getInstance();
		i.methodB();
	}
}

interface I3 {
	void methodB();
}

class B3 implements I3 {
	public void methodB() {
		System.out.println("methodB in B class");
	}
}

class InstanceManager {
	public static I3 getInstance() {
		return new B3(); // B3 타입-> I3 타입(실제 객체는 B3타입)
	}
}

public class InterfaceEx3 {
	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA();

	}

}
