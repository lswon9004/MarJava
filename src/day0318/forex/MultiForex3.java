package day0318.forex;
/* *
 * **
 * ***
 * ****
 * *****/
public class MultiForex3 {

	public static void main(String[] args) {
		for (int i = 0; i <5; i++) {
			for (int j = 0; j<= i;j++) {
				System.out.print("*");
			}
			System.out.println();//줄바꿈
		}
		System.out.println("------");

		for (int i = 0; i <5; i++) {
			for (int j = 4; j>= i;j--) {
				System.out.print("*");
			}
			System.out.println();//줄바꿈
		}
		System.out.println("------");
		
		for (int i = 0; i <5; i++) {
			for (int k= 4; k>i;k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i ;j++) {
				
				System.out.print("*");
			}
			System.out.println();//줄바꿈
		}
		System.out.println("-----------------");

		for (int i = 0; i <5; i++) {
			for (int j = 4; j>= i;j--) {
				System.out.print("*");
			}for (int k= 0; k<i;k++) {
				System.out.print(" ");
			}
			for (int k= 4; k>i;k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i ;j++) {
				
				System.out.print("*");
			}
			System.out.println();//줄바꿈
		}
		
		
	}

}
