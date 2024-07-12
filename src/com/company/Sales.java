package com.company;

public class Sales extends Employee implements Bonus {
	
	public Sales() {}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}


	@Override
	public void incentive(int pay) {
		int result = getSalary()+ (int)(pay*1.2);
		setSalary(result);
	}

	@Override
	public double tax() {
		double result = getSalary()*0.13;
		return result;
	}

	@Override
	public String toString() {
		return getName() +"\t"+ getDepartment() + "\t\t"+ getSalary();
	}

}
