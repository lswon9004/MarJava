package day0408.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferEx {

	public static void main(String[] args) {
		long ms = 0;

		try (FileInputStream fis = new FileInputStream("a.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {

			ms = System.currentTimeMillis();
			int i;
			while ((i = bis.read())!= -1) {
				bos.write(i);
			}
			ms = System.currentTimeMillis() - ms;

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일을 복사하는데 걸린 시간 : " + ms + "ms");
	}

}
