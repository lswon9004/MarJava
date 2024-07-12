package day0313.variable;

public class VarTypeEx3 {

	public static void main(String[] args) {
		//실수 : float / double
		//실수 리터널의 타입은 double
		double d = 3.14;
		
		//float f= 3.14;
		float f = 3.14f;//실수 리터널F -> float타입이 된다.
		
		double d2 = 0.1234567890123456789;
		float f2 = 0.1234567890123456789f;
		
		System.out.println("d2 :" + d2);
		System.out.println("f2 :" + f2);
		
		boolean stop = true;//true : 중지, false : 동작
		
		 if (stop) {
			 System.out.println("중지상태입니다.");
		 }else {
			 System.out.println("동작 중 입니다.");
		 }

	}

}
