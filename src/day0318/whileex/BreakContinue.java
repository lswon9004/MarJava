package day0318.whileex;

public class BreakContinue {

	public static void main(String[] args) {
		for (int i = 1; i<21; i++) {
			if (i%2==0) {
				continue;//break;
			}
			System.out.println("i : "+i);
		}
		EXIT://레이블(라벨)
		for (int i = 0; i<5;i++) {
			for (int j =0; j<5;j++) {
				if (j==2) {
					break EXIT;
				}
				System.out.println("i : "+i+", j : "+j);
			}
		}
	}

}
