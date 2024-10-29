package com.jcanunwah.cs5800.assignment04.solution02.meals;

public class Meal
{
	private Macronutrient carbs;
	private Macronutrient proteins;
	private Macronutrient fats;

	public Meal(Macronutrient carbs, Macronutrient proteins, Macronutrient fats) {
		this.carbs = carbs;
		this.proteins = proteins;
		this.fats = fats;
	}

	public String toString() {
		return "Meal:\n" +
			"  Carbs: " + this.carbs.getName() + "\n" +
			"  Proteins: " + this.proteins.getName() + "\n" +
			"  Fats: " + this.fats.getName();
	}
}
