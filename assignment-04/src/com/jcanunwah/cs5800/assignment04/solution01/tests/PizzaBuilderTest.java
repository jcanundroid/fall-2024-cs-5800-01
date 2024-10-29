package com.jcanunwah.cs5800.assignment04.solution01.tests;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.jcanunwah.cs5800.assignment04.solution01.pizzas.*;
import com.jcanunwah.cs5800.assignment04.solution01.pizzas.toppings.*;

public class PizzaBuilderTest
{
	@Test
	@DisplayName("all toppings are added via addXXX()")
	public void testAllToppings() {
		Pizza pizza =
			new PizzaBuilder().setChain("").setSize("")
				.addBacon().addBeef().addChicken()
				.addExtraCheese().addHamAndPineapple().addMushrooms()
				.addOlives().addOnions().addPepperoni()
				.addPeppers().addPesto().addSausage()
				.addSpicyPork().addSpinach().addTomatoAndBasil().build();

		ArrayList<Topping> pizzaToppings = pizza.getToppings();

		Topping[] allToppings = {
			new Bacon(), new Beef(), new Chicken(),
			new ExtraCheese(), new Ham(), new Pineapple(), new Mushrooms(),
			new Olives(), new Onions(), new Pepperoni(),
			new Peppers(), new Pesto(), new Sausage(),
			new SpicyPork(), new Spinach(), new Tomato(), new Basil()
		};

		ArrayList<String> pizzaToppingsNames = new ArrayList<String>();
		ArrayList<String> allToppingsNames = new ArrayList<String>();

		for (Topping topping : pizzaToppings) {
			pizzaToppingsNames.add(topping.getName());
		}

		for (Topping topping : allToppings) {
			allToppingsNames.add(topping.getName());
		}

		for (String topping : allToppingsNames) {
			if (!pizzaToppingsNames.contains(topping)) {
				Assert.fail("pizza is missing '" + topping + "'");
			}
		}
	}
}
