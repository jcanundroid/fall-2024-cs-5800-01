package com.jcanunwah.cs5800.assignment05.food;

import java.util.ArrayList;

public class LoyaltyDiscountDecorator extends Order
{
	private Order decoratedOrder;
	private boolean discountApplied;

	public LoyaltyDiscountDecorator(Order decoratedOrder, boolean discountApplied) {
		super(decoratedOrder.getCustomer(), decoratedOrder.getOrderedItems());
		this.decoratedOrder = decoratedOrder;
		this.discountApplied = discountApplied;
	}

	public double getPrice() {
		double multiplier = this.discountApplied ? 0.90 : 1.00;
		return this.decoratedOrder.getPrice() * multiplier;
	}

	public ArrayList<PricedItem> getOrderedItems() {
		ArrayList<PricedItem> newOrderedItems = new ArrayList<PricedItem>(this.decoratedOrder.getOrderedItems());

		if (this.discountApplied) {
			newOrderedItems.add(new Discount(this.decoratedOrder.getPrice() * 0.10));
		}

		return newOrderedItems;
	}
}
