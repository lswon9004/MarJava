package day0322.oob.init;

public class InitTest {
	static int cv = 1;
	int iv = 1;
	static {cv = 2;	}
	{iv = 2;	}

	public InitTest() {
		iv = 3;
	}

	public static void main(String[] args) {
		InitTest init = new InitTest();
		System.out.println(InitTest.cv);
		System.out.println(init.iv);
	}

}
