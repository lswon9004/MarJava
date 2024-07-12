package day0402.langex.wrapper;

public class WrapperEx1 {

	public static void main(String[] args) {
		Integer i1 = 100;
		Integer i2 = new Integer("100");
		
		System.out.println("i1 == i2 : "+(i1==i2));
		System.out.println("i1.eqals(i2) : "+(i1.equals(i2)));

		System.out.println(i1.toString());
		
		System.out.println("MAX : "+Integer.MAX_VALUE);
		System.out.println("MIN : "+Integer.MIN_VALUE);
		System.out.println("SIZE : "+Integer.SIZE);
		System.out.println("BYTES : "+Integer.BYTES);
		System.out.println("TYPE : "+Integer.TYPE);
	}

}
