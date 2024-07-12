package day0402.datetime;

import java.text.*;
import java.util.*;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd KK:mm:ss a");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}