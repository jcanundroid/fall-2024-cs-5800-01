package com.jcanunwah.cs5800.assignment04.solution02;

import com.jcanunwah.cs5800.assignment04.solution02.meals.*;

public class Customer
{
	private String name;
	private Meal meal;

	public Customer(String name, Meal meal) {
		this.name = name;
		this.meal = meal;
	}

	public void print() {
		System.out.println(
			"Customer: " + this.name + "\n" +
			this.meal.toString() + "\n"
		);
	}
}
