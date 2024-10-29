package com.jcanunwah.cs5800.assignment04.solution01.pizzas;

import java.util.ArrayList;

import com.jcanunwah.cs5800.assignment04.solution01.pizzas.toppings.*;

public class Pizza
{
	private String chain;
	private String size;
	private ArrayList<Topping> toppings;

	public Pizza(String chain, String size, ArrayList<Topping> toppings) {
		this.chain = chain;
		this.size = size;
		this.toppings = toppings;
	}

	public ArrayList<Topping> getToppings() {
		return this.toppings;
	}

	public void eat() {
		String text = this.chain + ": " + this.size + " pizza with ";

		if (this.toppings.size() == 0) {
			text += "no toppings";
		}
		else {
			text += this.toppings.get(0).getName();

			for (int i = 1; i < this.toppings.size(); ++i) {
				text += ", " + this.toppings.get(i).getName();
			}
		}

		System.out.println(text);
	}
}
