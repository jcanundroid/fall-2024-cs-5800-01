package com.jcanunwah.cs5800.assignment04.solution02.meals;

public class UnrestrictedMealFactory extends MealFactory
{
	private static UnrestrictedMealFactory instance;

	private UnrestrictedMealFactory() {
	}

	public static UnrestrictedMealFactory getInstance() {
		if (instance == null) {
			instance = new UnrestrictedMealFactory();
		}

		return instance;
	}

	public Macronutrient getCarbs() {
		return MacronutrientFactory.getInstance().createMacronutrient(Macronutrient.CARBS, Macronutrient.UNRESTRICTED);
	}

	public Macronutrient getProteins() {
		return MacronutrientFactory.getInstance().createMacronutrient(Macronutrient.PROTEINS, Macronutrient.UNRESTRICTED);
	}

	public Macronutrient getFats() {
		return MacronutrientFactory.getInstance().createMacronutrient(Macronutrient.FATS, Macronutrient.UNRESTRICTED);
	}
}
