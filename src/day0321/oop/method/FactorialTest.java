package day0321.oop.method;

public class FactorialTest {
	static int factorial(int n) {
		int result = 0;
		if (n==1) {
			result=1;
		}else {
			result = n*factorial(n-1);
		}
		return result;
	}

	public static void main(String[] args) {
		int r = factorial(7);
		System.out.println("7! = "+r);
	}

}
