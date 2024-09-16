package com.jcanunwah.cs5800.assignment01.solution02.ships;

public class CargoShip extends Ship
{
	private int maxCapacity;

	public CargoShip(String name, String yearBuilt, int maxCapacity) {
		super(name, yearBuilt);

		this.maxCapacity = maxCapacity;
	}

	public int getMaxCapacity() {
		return this.maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public void print() {
		System.out.println("Name: " + this.getName() + ", " + this.maxCapacity + " tonnes maximum");
	}
}
