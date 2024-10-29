package com.jcanunwah.cs5800.assignment04.solution02.meals;

public class NutlessMealFactory extends MealFactory
{
	private static NutlessMealFactory instance;

	private NutlessMealFactory() {
	}

	public static NutlessMealFactory getInstance() {
		if (instance == null) {
			instance = new NutlessMealFactory();
		}

		return instance;
	}

	public Macronutrient getCarbs() {
		return MacronutrientFactory.getInstance().createMacronutrient(Macronutrient.CARBS, Macronutrient.NUTLESS);
	}

	public Macronutrient getProteins() {
		return MacronutrientFactory.getInstance().createMacronutrient(Macronutrient.PROTEINS, Macronutrient.NUTLESS);
	}

	public Macronutrient getFats() {
		return MacronutrientFactory.getInstance().createMacronutrient(Macronutrient.FATS, Macronutrient.NUTLESS);
	}
}
