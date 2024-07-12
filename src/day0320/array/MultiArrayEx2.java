package day0320.array;

public class MultiArrayEx2 {

	public static void main(String[] args) {
		int[][][] arr = new int [3][3][3];
		int num =1;
		for (int i =0;i<arr.length;i++) {
			for (int j=0; j<arr[i].length;j++) {
				for (int k=0; k<arr[i][j].length;k++) {
					arr[i][j][k]=num;
					num++;
				}
			}
		}
		for (int[][]i1:arr) {
			for (int[]i2:i1) {
				for (int i3:i2) {
					System.out.println(i3);
				}
			}
		}
	}

}
