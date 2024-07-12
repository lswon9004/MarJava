package day0325.oob.inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {
		Date now= new Date();//현재 시간을 저장하고 있는 Date 객체 생성
		System.out.println(now);
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd hh:mm ss");
		String nowsdf =sdf.format(now);
		System.out.println(nowsdf);
		
		int r = (int)(Math.random()*10);
		System.out.println(r);
	}

}
