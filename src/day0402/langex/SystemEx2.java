package day0402.langex;

public class SystemEx2 {

	public static void main(String[] args) {
		
		for (int i =0; i<10;i++) {
			System.out.println(i);
			if (i==5) {
				//JVM프로세스 종료
				System.out.println("프로그램 강제 종료");
				System.exit(0);
			}
		}
	}

}
