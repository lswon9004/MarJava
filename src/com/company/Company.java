package com.company;

public class Company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Cilnten", 2, "sales", 1200);

		System.out.println("name\tdepartmet\tsalary");
		System.out.println("-------------------------------------");
		for (Employee e : employees) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("인센티브 100 지급");
		System.out.println("name\tdepartmet\tsalary\ttax");
		System.out.println("-------------------------------------");
		
		int pay = 100;
		for (Employee e : employees) {
			if (e instanceof Secretary) {
				((Secretary) e).incentive(pay);
			} else if (e instanceof Sales) {
				((Sales) e).incentive(pay);
			}
			System.out.printf("%s\t%s\n", e, e.tax());
		}		
	}
}
