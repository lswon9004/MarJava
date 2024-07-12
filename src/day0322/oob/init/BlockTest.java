package day0322.oob.init;

public class BlockTest {

	static {
		System.out.println("Sttic{}");
	}
	{
		System.out.println("instance{}");
	}

	public BlockTest() {
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		BlockTest bt1 = new BlockTest();
		BlockTest bt2 = new BlockTest();
	}

}
