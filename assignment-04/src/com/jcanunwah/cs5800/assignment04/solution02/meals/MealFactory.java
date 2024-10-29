package com.jcanunwah.cs5800.assignment04.solution02.meals;

public abstract class MealFactory
{
	public MealFactory() {
	}

	public Meal createMeal() {
		Macronutrient carbs = this.getCarbs();
		Macronutrient proteins = this.getProteins();
		Macronutrient fats = this.getFats();

		return new Meal(carbs, proteins, fats);
	}

	public abstract Macronutrient getCarbs();
	public abstract Macronutrient getProteins();
	public abstract Macronutrient getFats();
}
