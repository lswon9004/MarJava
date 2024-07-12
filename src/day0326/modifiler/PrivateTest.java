package day0326.modifiler;

class A1{
	private int i = 10;
}
class B1 extends A1{
	void method() {
		//i = 10; //The field A1.i is not visible
	}
}
public class PrivateTest {
	public static void main(String[] args) {
		B1 a1 = new B1();
	//	System.out.println(a1.i);//The field A.i is not visible
	//	System.out.println(a1.j); // j cannot be resolved or is not a field
	}

}



