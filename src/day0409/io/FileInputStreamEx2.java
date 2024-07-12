package day0409.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input.txt")){
			
			byte[] b = new byte[20];
			int len;
			
			while((len = fis.read(b))!=-1) {
				//배열이 다 차거나 마지막 데이터까지 읽어온다.
				for (int i=0;i<len;i++) {
					System.out.println((char)b[i]);
				}
			}
			System.out.println(new String(b));//byte[]->String
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
