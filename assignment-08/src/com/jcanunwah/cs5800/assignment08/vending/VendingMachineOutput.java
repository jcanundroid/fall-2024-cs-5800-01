package com.jcanunwah.cs5800.assignment08.vending;

public class VendingMachineOutput
{
	private Snack snack;
	private double change;

	public VendingMachineOutput(Snack snack, double change) {
		this.snack = snack;
		this.change = change;
	}

	public String toString() {
		String result = "Item: ";

		result += this.snack == null ? "None" : this.snack.getName();
		result += "; Change: $" + this.change;

		return result;
	}
}
