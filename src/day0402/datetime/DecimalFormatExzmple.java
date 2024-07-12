package day0402.datetime;

import java.text.DecimalFormat;

public class DecimalFormatExzmple {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df;
		//정수 자리싸지 표기
		df = new DecimalFormat("0,000");
		System.out.println(df.format(num));
		
		//무조건 소수 첫째자리까지 하루
		df = new DecimalFormat("0,000.0");
		System.out.println(df.format(num));
	}

}
