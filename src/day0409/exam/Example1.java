package day0409.exam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("파일 경로를 입력하세요 > ");
		String str = scan.next();
		File org = new File(str);
		
		String newpath = "C:\\Users\\swon\\eclipse-workspace\\MarJava\\src\\day0409\\exam\\"+org.getName();
		try(FileInputStream fis = new FileInputStream(org);
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream(newpath);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			
			byte[] bArr = new byte[fis.available()];
			while ((bis.read(bArr))!= -1) {
				bos.write(bArr);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 이동");
	}

}
