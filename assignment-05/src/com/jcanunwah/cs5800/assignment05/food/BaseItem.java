package com.jcanunwah.cs5800.assignment05.food;

public abstract class BaseItem implements PricedItem
{
	private String name;
	private double price;

	public BaseItem(String name, double price) {
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
