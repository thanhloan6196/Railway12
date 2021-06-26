package com.vti.entity.AbstractionQuestion2;

public class Employee extends User {

	public Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePay() {
		
		return getSalaryRatio()*420;
	}

}
