package com.jcanunwah.cs5800.assignment01.solution01.employees;

public class SalariedEmployee extends Employee
{
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
		super(firstName, lastName, ssn);

		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return this.weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
}
