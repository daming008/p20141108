package com.dm;

public class SalariedEmployee extends Employee {
	private double monthlySalary;


	public SalariedEmployee(String name, int number, Mydate birthday,double monthlySalary) {
		super(name, number, birthday);
		this.monthlySalary=monthlySalary;
		// TODO Auto-generated constructor stub
	}



	double earinings() {
		return monthlySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee "+super.toString()+"[monthlySalary=" + monthlySalary + "]";
	}
}
