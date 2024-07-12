package day0315.opertor;

public class OperatorEx6 {

	public static void main(String[] args) {
		int i = 10 ;
		int j = 11;
		
		boolean result = (i == j) && (++i == j);
		System.out.println("result : "+ result);
		System.out.println("i : "+i);
		
		result = !(i == j) && (++i == j);
		System.out.println("result : "+ result);
		System.out.println("i : "+i);
		
		result = !(i == j) || (++i == j);
		System.out.println("result : "+ result);
		System.out.println("i : "+i);
		
		result = !(i == j) || (++i == j);
		System.out.println("result : "+ result);
		System.out.println("i : "+i);
	}

}
