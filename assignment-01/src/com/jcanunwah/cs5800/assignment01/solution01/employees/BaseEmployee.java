package com.jcanunwah.cs5800.assignment01.solution01.employees;

public class BaseEmployee extends Employee
{
	private double baseSalary;

	public BaseEmployee(String firstName, String lastName, String ssn, double baseSalary) {
		super(firstName, lastName, ssn);

		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return this.baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
}
