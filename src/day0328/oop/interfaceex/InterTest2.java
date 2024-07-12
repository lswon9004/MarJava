package day0328.oop.interfaceex;

public class InterTest2 implements Inter3 {

	public static void main(String[] args) {
		Inter1 i1 = new  InterTest2();
		System.out.println(i1.getI());
		Inter2 i2 = (Inter2)i1;
		System.out.println(i2.getI());
		Inter3 i3 = (Inter3)i1;
		System.out.println(i3.getI());
		System.out.println(i3.getData());
	}

	@Override
	public int getI() {
		return I;
	}

	@Override
	public int getData() {
		return 100;
	}

}
