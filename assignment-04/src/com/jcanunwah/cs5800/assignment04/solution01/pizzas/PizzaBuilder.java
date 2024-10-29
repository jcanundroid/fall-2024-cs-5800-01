package com.jcanunwah.cs5800.assignment04.solution01.pizzas;

import java.util.ArrayList;

import com.jcanunwah.cs5800.assignment04.solution01.pizzas.toppings.*;

public class PizzaBuilder
{
	private String chain;
	private String size;
	private ArrayList<Topping> toppings;

	public PizzaBuilder() {
		this.toppings = new ArrayList<Topping>();
	}

	public Pizza build() {
		return new Pizza(this.chain, this.size, this.toppings);
	}

	public PizzaBuilder setChain(String chain) {
		this.chain = chain;
		return this;
	}

	public PizzaBuilder setSize(String size) {
		this.size = size;
		return this;
	}

	public PizzaBuilder addBacon() {
		this.toppings.add(new Bacon());
		return this;
	}

	public PizzaBuilder addBeef() {
		this.toppings.add(new Beef());
		return this;
	}

	public PizzaBuilder addChicken() {
		this.toppings.add(new Chicken());
		return this;
	}

	public PizzaBuilder addExtraCheese() {
		this.toppings.add(new ExtraCheese());
		return this;
	}

	public PizzaBuilder addHam() {
		this.toppings.add(new Ham());
		return this;
	}

	public PizzaBuilder addHamAndPineapple() {
		this.toppings.add(new Ham());
		this.toppings.add(new Pineapple());
		return this;
	}

	public PizzaBuilder addMushrooms() {
		this.toppings.add(new Mushrooms());
		return this;
	}

	public PizzaBuilder addOlives() {
		this.toppings.add(new Olives());
		return this;
	}

	public PizzaBuilder addOnions() {
		this.toppings.add(new Onions());
		return this;
	}

	public PizzaBuilder addPepperoni() {
		this.toppings.add(new Pepperoni());
		return this;
	}

	public PizzaBuilder addPeppers() {
		this.toppings.add(new Peppers());
		return this;
	}

	public PizzaBuilder addPesto() {
		this.toppings.add(new Pesto());
		return this;
	}

	public PizzaBuilder addSausage() {
		this.toppings.add(new Sausage());
		return this;
	}

	public PizzaBuilder addSpicyPork() {
		this.toppings.add(new SpicyPork());
		return this;
	}

	public PizzaBuilder addSpinach() {
		this.toppings.add(new Spinach());
		return this;
	}

	public PizzaBuilder addTomatoAndBasil() {
		this.toppings.add(new Tomato());
		this.toppings.add(new Basil());
		return this;
	}
}
