package day0322.oob.constructor;

public class CarTest {

	public static void main(String[] args) {
		//기본생성자로 생성
		Car1 c1 = new Car1();
		c1.model="포르세";
		c1.color="RED";
		c1.door=2;
		
		c1.printCar();
		
		//매개변수 있는 생성자
		Car1 c2 = new Car1("람보르기니","YELLOW",4);
		
		c2.printCar();
	}
 
}
