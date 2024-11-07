package com.jcanunwah.cs5800.assignment05;

import com.jcanunwah.cs5800.assignment05.food.*;

public class Main
{
	public static void main(String[] args) {
		Order bobOrder = new Order(
			new Customer("Bob", false),
			new PricedItem[] {
				new Cheeseburger(),
				new PeppersDecorator(new Pizza()),
				new ExtraCheeseDecorator(new DoubleMeatDecorator(new HotDog()))
			}
		);

		Order aliceOrder = new Order(
			new Customer("Alice", true),
			new PricedItem[] {
				new Cheeseburger(),
				new PeppersDecorator(new Pizza()),
				new ExtraCheeseDecorator(new DoubleMeatDecorator(new HotDog()))
			}
		);

		bobOrder.print();
		System.out.println("");
		aliceOrder.print();
	}
}
