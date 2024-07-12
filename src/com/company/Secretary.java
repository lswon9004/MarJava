package com.company;

public class Secretary extends Employee implements Bonus {
	
	
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	public Secretary() {}

	@Override
	public void incentive(int pay) {
		int result = getSalary()+ (int)(pay*0.8);
		setSalary(result);
	}

	@Override
	public double tax() {
		double result = getSalary()*0.1;
		return result;
	}
	

}
