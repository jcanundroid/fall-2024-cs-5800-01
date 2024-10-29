package com.jcanunwah.cs5800.assignment04.solution02.meals;

public class PaleoMealFactory extends MealFactory
{
	private static PaleoMealFactory instance;

	private PaleoMealFactory() {
	}

	public static PaleoMealFactory getInstance() {
		if (instance == null) {
			instance = new PaleoMealFactory();
		}

		return instance;
	}

	public Macronutrient getCarbs() {
		return MacronutrientFactory.getInstance().createMacronutrient(Macronutrient.CARBS, Macronutrient.PALEO);
	}

	public Macronutrient getProteins() {
		return MacronutrientFactory.getInstance().createMacronutrient(Macronutrient.PROTEINS, Macronutrient.PALEO);
	}

	public Macronutrient getFats() {
		return MacronutrientFactory.getInstance().createMacronutrient(Macronutrient.FATS, Macronutrient.PALEO);
	}
}
