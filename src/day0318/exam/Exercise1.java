package day0318.exam;

public class Exercise1 {

	public static void main(String[] args) {
		int sum =0;
		for (int i = 1; i<21;i++) {
			if (i%2==0 || i%3==0) {
				continue;
			}
			sum+= i;
		}
		System.out.println(sum);
	}

}
