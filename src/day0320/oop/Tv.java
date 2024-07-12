package day0320.oop;

public class Tv {
		static String color;
		int inch;
		String model;
		int channel;
		
		void setColor() {
			color = "#000000";
		}
		
		boolean power;
		
		void power() { power = !power; }
		void chUp() { channel++; }
		void chdown() { channel--; }
		
		
	

}
