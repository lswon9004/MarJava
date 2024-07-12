
package day0327.exam;

public class Bmi {
	private double lenghth;
	private double weight;
	
	
	public Bmi(double lenghth, double weight) {
		this.lenghth = lenghth*0.01;
		this.weight = weight;
	}

	public Bmi() {}
	
	public double mtdBMI() {
		return weight/((lenghth*0.01)*(lenghth*0.01));
	}
	public double getLenghth() {
		return lenghth;
	}
	public void setLenghth(double lenghth) {
		this.lenghth = lenghth;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return String.format("%.2f", mtdBMI());
	}
	
	
}
