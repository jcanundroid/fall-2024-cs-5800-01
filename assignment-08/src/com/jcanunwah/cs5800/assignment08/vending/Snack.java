package com.jcanunwah.cs5800.assignment08.vending;

public class Snack
{
	public static final Snack Coke = new Snack("Coke", 2.00, 10);
	public static final Snack Pepsi = new Snack("Pepsi", 2.00, 5);
	public static final Snack Cheetos = new Snack("Cheetos", 1.50, 10);
	public static final Snack Doritos = new Snack("Doritos", 1.50, 10);
	public static final Snack KitKat = new Snack("KitKat", 1.00, 10);
	public static final Snack Snickers = new Snack("Snickers", 1.00, 10);

	private Snack next;
	private String name;
	private double price;
	private int quantity;

	public Snack(String name, double price, int quantity) {
		this.next = null;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	protected String getName() {
		return this.name;
	}

	protected double getPrice() {
		return this.price;
	}

	protected void decrementQuantity() {
		this.quantity -= 1;
	}

	protected void setNext(Snack next) {
		this.next = next;
	}

	protected Snack get(String name) {
		if (this.name.equalsIgnoreCase(name)) {
			if (this.quantity < 1) {
				return null;
			}

			return this;
		}

		if (this.next == null) {
			return null;
		}

		return this.next.get(name);
	}
}
