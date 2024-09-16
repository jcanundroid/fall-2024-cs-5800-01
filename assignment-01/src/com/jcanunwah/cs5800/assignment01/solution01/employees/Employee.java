package com.jcanunwah.cs5800.assignment01.solution01.employees;

public abstract class Employee
{
	private String firstName;
	private String lastName;
	private String ssn;

	public Employee(String firstName, String lastName, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return this.ssn;
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
}
