package com.jcanunwah.cs5800.assignment01.solution01.employees;

public class HourlyEmployee extends Employee
{
	private double wage;
	private double hoursWorked;

	public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hoursWorked) {
		super(firstName, lastName, ssn);

		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}

	public double getWage() {
		return this.wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public double getHoursWorked() {
		return this.hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
}
