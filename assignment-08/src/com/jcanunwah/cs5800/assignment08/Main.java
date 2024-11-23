package com.jcanunwah.cs5800.assignment08;

import com.jcanunwah.cs5800.assignment08.vending.*;

public class Main
{
	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();

		System.out.println("Buying Coke for $2.00 with 9 quarters:");

		vendingMachine.selectSnack("Coke");

		for (int i = 0; i < 9; ++i) {
			vendingMachine.insertMoney(0.25);
		}

		System.out.println(vendingMachine.dispense());

		System.out.println("\nBuying KitKat for $1.00 with 1 dollar:");

		vendingMachine.selectSnack("KitKat");
		vendingMachine.insertMoney(1.00);

		System.out.println(vendingMachine.dispense());

		System.out.println("\nBuying 11 Snickers for $1.00 with 1 dollar, low stock:");

		for (int i = 0; i < 11; ++i) {
			vendingMachine.selectSnack("Snickers");
			vendingMachine.insertMoney(1.00);
			System.out.println(vendingMachine.dispense());
		}
	}
}
