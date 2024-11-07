package com.jcanunwah.cs5800.assignment05.food;

public abstract class ToppingItem implements PricedItem
{
	private String name;
	private double price;

	public ToppingItem(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}
}
