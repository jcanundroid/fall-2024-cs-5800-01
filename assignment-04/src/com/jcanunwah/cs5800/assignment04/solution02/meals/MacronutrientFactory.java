package com.jcanunwah.cs5800.assignment04.solution02.meals;

import java.util.ArrayList;
import java.util.Random;

public class MacronutrientFactory
{
	private static MacronutrientFactory instance;

	private Random random;

	private MacronutrientFactory() {
		this.random = new Random(System.currentTimeMillis());
	}

	public static MacronutrientFactory getInstance() {
		if (instance == null) {
			instance = new MacronutrientFactory();
		}

		return instance;
	}

	public Macronutrient createMacronutrient(String type, String restriction) {
		Macronutrient[] options;

		if (type.equalsIgnoreCase(Macronutrient.CARBS)) {
			options = Macronutrient.CARBS_OPTIONS;
		}
		else if (type.equalsIgnoreCase(Macronutrient.PROTEINS)) {
			options = Macronutrient.PROTEINS_OPTIONS;
		}
		else if (type.equalsIgnoreCase(Macronutrient.FATS)) {
			options = Macronutrient.FATS_OPTIONS;
		}
		else {
			return null;
		}

		ArrayList<Macronutrient> validOptions = new ArrayList<Macronutrient>();

		for (Macronutrient macro : options) {
			boolean allowed = true;

			for (String disallowedDiet : macro.getDisallowedDiets()) {
				if (restriction.equalsIgnoreCase(disallowedDiet)) {
					allowed = false;
					break;
				}
			}

			if (allowed) {
				validOptions.add(macro);
			}
		}

		if (validOptions.size() == 0) {
			return null;
		}

		return validOptions.get(this.random.nextInt(validOptions.size()));
	}
}
