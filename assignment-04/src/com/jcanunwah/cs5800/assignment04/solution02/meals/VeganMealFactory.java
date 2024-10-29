package com.jcanunwah.cs5800.assignment04.solution02.meals;

public class VeganMealFactory extends MealFactory
{
	private static VeganMealFactory instance;

	private VeganMealFactory() {
	}

	public static VeganMealFactory getInstance() {
		if (instance == null) {
			instance = new VeganMealFactory();
		}

		return instance;
	}

	public Macronutrient getCarbs() {
		return MacronutrientFactory.getInstance().createMacronutrient(Macronutrient.CARBS, Macronutrient.VEGAN);
	}

	public Macronutrient getProteins() {
		return MacronutrientFactory.getInstance().createMacronutrient(Macronutrient.PROTEINS, Macronutrient.VEGAN);
	}

	public Macronutrient getFats() {
		return MacronutrientFactory.getInstance().createMacronutrient(Macronutrient.FATS, Macronutrient.VEGAN);
	}
}
