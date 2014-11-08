package com.dm;

import java.util.Scanner;

public class TestInterface {
	public static void main(String[] args) {
		
		Employee[] emps=new Employee[2];
		
		emps[0]=new SalariedEmployee("ldm", 1001, new Mydate(2009, 12, 15), 20000);
		emps[1]=new HourlyEmployee("txy", 1002, new Mydate(1990, 10, 10), 200, 6);
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Please Input a Month");
		int month=s.nextInt();
		
		for(int i=0;i<emps.length;i++){
			if(month==emps[0].getBirthday().getMonth()){
				System.out.println("add sal");
			}
			System.out.println(emps[i]);
		}
	}
}
