package day0321.oop.method;

public class MethodExMain {

	public static void main(String[] args) {
		MethodEx me= new MethodEx();
		
		long l = me.add(10, 20);
		System.out.println("me.add(10, 20) : "+l);
		
		System.out.println("me.multiply(2, 5) : "+me.multuply(2, 5));
		double d= me.divide(5, 3);
		System.out.printf("me.divide(5, 3) : %.1f\n",d);
		me.addString("EXIT", "awf");
		
		
	}

}
