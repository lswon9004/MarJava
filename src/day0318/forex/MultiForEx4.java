package day0318.forex;

public class MultiForEx4 {

	public static void main(String[] args) {
		//A도시와 B도시 사이에는 강이 흐르고 있고 중간에 섬이 하나 있다.
		//A도시와 섬을 연결하는 다리는 3개 있고 
		//섬과 B도시를 연결하는 다리는 4개 있다.
		//이때 A에서 섬을 통해 B로 가는 방법의 갯수는?
		int c = 0;
		for (int i =1; i<4;i++)
			for (int j = 1 ; j<=4;j++) {
				c++;
			}
		System.out.println(c);

	}

}
