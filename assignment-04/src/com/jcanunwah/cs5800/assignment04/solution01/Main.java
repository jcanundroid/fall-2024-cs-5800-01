package com.jcanunwah.cs5800.assignment04.solution01;

import com.jcanunwah.cs5800.assignment04.solution01.pizzas.*;

public class Main
{
	public static void main(String[] args) {
		Pizza small3ToppingPizza =
			new PizzaBuilder().setChain("Pizza Hut").setSize("small")
				.addBacon().addBeef().addChicken().build();

		Pizza medium6ToppingPizza =
			new PizzaBuilder().setChain("Pizza Hut").setSize("medium")
				.addBacon().addBeef().addChicken()
				.addExtraCheese().addHam().addMushrooms().build();

		Pizza large9ToppingPizza =
			new PizzaBuilder().setChain("Pizza Hut").setSize("large")
				.addBacon().addBeef().addChicken()
				.addExtraCheese().addHam().addMushrooms()
				.addOlives().addOnions().addPepperoni().build();

		System.out.println("Pizza Hut Small, Medium, and Large:\n");

		small3ToppingPizza.eat();
		medium6ToppingPizza.eat();
		large9ToppingPizza.eat();

		System.out.println("\nPizza Hut, Little Caesars, and Dominos:\n");

		Pizza phPizza1 =
			new PizzaBuilder().setChain("Pizza Hut").setSize("large")
				.addBacon().addBeef().addChicken().build();

		Pizza phPizza2 =
			new PizzaBuilder().setChain("Pizza Hut").setSize("small")
				.addSausage().addMushrooms().build();

		Pizza lcPizza1 =
			new PizzaBuilder().setChain("Little Caesars").setSize("medium")
				.addBacon().addBeef().addChicken()
				.addExtraCheese().addHam().addMushrooms()
				.addOlives().addOnions().build();

		Pizza lcPizza2 =
			new PizzaBuilder().setChain("Little Caesars").setSize("small")
				.addBacon().addBeef().addChicken()
				.addExtraCheese().addHam().addMushrooms().build();

		Pizza dPizza1 =
			new PizzaBuilder().setChain("Dominos").setSize("small")
				.addBacon().build();

		Pizza dPizza2 =
			new PizzaBuilder().setChain("Dominos").setSize("large")
				.addBacon().addBeef().addChicken().build();

		phPizza1.eat();
		phPizza2.eat();
		lcPizza1.eat();
		lcPizza2.eat();
		dPizza1.eat();
		dPizza2.eat();
	}
}
