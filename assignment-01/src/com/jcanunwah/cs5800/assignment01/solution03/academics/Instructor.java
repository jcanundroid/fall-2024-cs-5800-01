package com.jcanunwah.cs5800.assignment01.solution03.academics;

public class Instructor
{
	private String firstName;
	private String lastName;
	private String office;

	public Instructor(String firstName, String lastName, String office) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.office = office;
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

	public String getOffice() {
		return this.office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
}
