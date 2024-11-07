package com.jcanunwah.cs5800.assignment05.food;

public class Discount extends BaseItem
{
	public Discount(double amount) {
		super("Loyalty Discount", -1.0 * amount);
	}
}
