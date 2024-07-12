package day0408.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("text.txt")){
			
			byte[] bArr = { 1, 2, 3, 4 };
			
			fos.write(bArr);
			fos.write("안녕".getBytes());//String ->byte[]
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
