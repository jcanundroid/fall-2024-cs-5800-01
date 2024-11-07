package com.jcanunwah.cs5800.assignment05.food;

public abstract class BaseItemDecorator implements PricedItem
{
	private PricedItem decoratedBase;
	private ToppingItem topping;

	public BaseItemDecorator(PricedItem decoratedBase, ToppingItem topping) {
		this.decoratedBase = decoratedBase;
		this.topping = topping;
	}

	public String getName() {
		return this.decoratedBase.getName() + ", " + this.topping.getName();
	}

	public double getPrice() {
		return this.decoratedBase.getPrice() + this.topping.getPrice();
	}
}
