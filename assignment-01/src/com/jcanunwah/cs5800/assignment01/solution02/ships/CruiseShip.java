package com.jcanunwah.cs5800.assignment01.solution02.ships;

public class CruiseShip extends Ship
{
	private int maxPassengers;

	public CruiseShip(String name, String yearBuilt, int maxPassengers) {
		super(name, yearBuilt);

		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return this.maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public void print() {
		System.out.println("Name: " + this.getName() + ", " + this.maxPassengers + " passengers maximum");
	}
}
