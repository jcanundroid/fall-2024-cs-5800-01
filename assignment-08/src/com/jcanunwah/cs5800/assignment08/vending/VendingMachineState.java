package com.jcanunwah.cs5800.assignment08.vending;

public class VendingMachineState
{
	private SnackDispenseHandler dispenser;
	private String state;
	private double insertedMoney;
	private double storedMoney;

	protected VendingMachineState(Snack[] snacks) {
		this.dispenser = new SnackDispenseHandler(snacks);
		this.state = "idle";
		this.insertedMoney = 0.00;
		this.storedMoney = 0.00;
	}

	protected void reset() {
		this.state = "idle";
		this.insertedMoney = 0.00;
	}

	protected void setSnack(String name) {
		if (this.state == "idle") {
			this.state = "selected:" + name;
		}
	}

	protected void insertMoney(double amount) {
		if (this.state.startsWith("selected:")) {
			this.insertedMoney += amount;
		}
	}

	protected VendingMachineOutput dispense() {
		if (!this.state.startsWith("selected:")) {
			return null;
		}

		String snackName = this.state.substring(9);
		Snack snack = this.dispenser.get(snackName);

		if (snack == null || this.insertedMoney < snack.getPrice()) {
			VendingMachineOutput result = new VendingMachineOutput(null, this.insertedMoney);
			this.reset();
			return result;
		}

		VendingMachineOutput result = new VendingMachineOutput(snack, this.insertedMoney - snack.getPrice());

		snack.decrementQuantity();

		this.storedMoney += snack.getPrice();

		this.reset();

		return result;
	}
}
