package com.jcanunwah.cs5800.assignment08.vending;

public class SnackDispenseHandler
{
	private Snack chain;

	public SnackDispenseHandler(Snack[] snacks) {
		this.chain = snacks[0];

		for (int i = 0; i < snacks.length - 1; ++i) {
			snacks[i].setNext(snacks[i + 1]);
		}
	}

	public Snack get(String name) {
		return this.chain.get(name);
	}
}
