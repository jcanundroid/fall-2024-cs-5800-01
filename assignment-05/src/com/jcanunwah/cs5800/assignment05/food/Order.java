package com.jcanunwah.cs5800.assignment05.food;

import java.util.Arrays;
import java.util.ArrayList;

public class Order
{
	private Customer customer;
	private ArrayList<PricedItem> orderedItems;

	public Order(Customer customer, ArrayList<PricedItem> orderedItems) {
		this.customer = customer;
		this.orderedItems = orderedItems;
	}

	public Order(Customer customer, PricedItem[] orderedItems) {
		this(customer, new ArrayList<PricedItem>(Arrays.asList(orderedItems)));
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public ArrayList<PricedItem> getOrderedItems() {
		return this.orderedItems;
	}

	public double getPrice() {
		double price = 0.0;

		for (PricedItem item : this.orderedItems) {
			price += item.getPrice();
		}

		return price;
	}

	public void print() {
		Order modifiedOrder = new LoyaltyDiscountDecorator(this, this.customer.getIsLoyal());

		System.out.println("Order for customer: " + modifiedOrder.getCustomer().getName());

		for (PricedItem item : modifiedOrder.getOrderedItems()) {
			System.out.println("  " + item.getName() + ": $" + item.getPrice());
		}

		System.out.println("\nTotal: $" + modifiedOrder.getPrice());
	}
}
