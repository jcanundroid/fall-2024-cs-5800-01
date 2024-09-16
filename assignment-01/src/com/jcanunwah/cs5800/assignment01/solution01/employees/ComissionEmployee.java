package com.jcanunwah.cs5800.assignment01.solution01.employees;

public class ComissionEmployee extends Employee
{
	private double comissionRate;
	private double grossSales;

	public ComissionEmployee(String firstName, String lastName, String ssn, double comissionRate, double grossSales) {
		super(firstName, lastName, ssn);

		this.comissionRate = comissionRate;
		this.grossSales = grossSales;
	}

	public double getComissionRate() {
		return this.comissionRate;
	}

	public void setComissionRate(int comissionRate) {
		this.comissionRate = comissionRate;
	}

	public double getGrossSales() {
		return this.grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}
}
