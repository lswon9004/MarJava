package day0408.lambda;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class LambdaEx2 {
	
	public static void main(String[] args) {
		Consumer<String> c1 = s -> System.out.println(s+" world!!");//void accept(T t)
		c1.accept("hello");
		//int값 받아서 제곱을 출력//void accept(int t)
		IntConsumer c2 = value -> System.out.println(Math.pow(value, 2));
		c2.accept(2);
		
		 
	}

}
