package com.jcanunwah.cs5800.assignment05.food;

public class Customer
{
	private String name;
	private boolean isLoyal;

	public Customer(String name, boolean isLoyal) {
		this.name = name;
		this.isLoyal = isLoyal;
	}

	public String getName() {
		return this.name;
	}

	public boolean getIsLoyal() {
		return this.isLoyal;
	}
}
