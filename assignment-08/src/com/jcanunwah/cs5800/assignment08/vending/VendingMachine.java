package com.jcanunwah.cs5800.assignment08.vending;

public class VendingMachine
{
	private Snack[] snacks;
	private VendingMachineState state;

	public VendingMachine() {
		this.snacks = new Snack[] {
			Snack.Coke,
			Snack.Pepsi,
			Snack.Cheetos,
			Snack.Doritos,
			Snack.KitKat,
			Snack.Snickers
		};

		this.state = new VendingMachineState(this.snacks);
	}

	public void selectSnack(String name) {
		this.state.setSnack(name);
	}

	public void insertMoney(double amount) {
		this.state.insertMoney(amount);
	}

	public VendingMachineOutput dispense() {
		return this.state.dispense();
	}
}
