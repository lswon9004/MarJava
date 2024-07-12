package day0409.io;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("알파뱃 입혁 후 [entrer]를 누르세요");
		int i;
		try {
			while((i=System.in.read())!='\n'){
				//read() : 엔터 입력까지 기다럈다가 1byte씩 읽어 온다.
				System.out.print((char)i);
				System.out.println("("+i+")");
			}
		}catch(IOException e) {
			
		}
	}

}
