package com.jcanunwah.cs5800.assignment01.solution02.ships;

public class Ship
{
	private String name;
	private String yearBuilt;

	public Ship(String name, String yearBuilt) {
		this.name = name;
		this.yearBuilt = yearBuilt;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYearBuilt() {
		return this.yearBuilt;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public void print() {
		System.out.println("Name: " + this.name + ", built in " + this.yearBuilt);
	}
}
