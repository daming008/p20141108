package com.dm;

public class HourlyEmployee extends Employee {

	private double wage;
	private double hour;
	
	public HourlyEmployee(String name, int number, Mydate birthday,
			double wage, double hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}
	@Override
	double earinings() {
		// TODO Auto-generated method stub
		return wage*hour;
	}
	@Override
	public String toString() {
		return "HourlyEmployee "+super.toString()+"wage=" + wage + ", hour=" + hour + "]";
	}
	
}
