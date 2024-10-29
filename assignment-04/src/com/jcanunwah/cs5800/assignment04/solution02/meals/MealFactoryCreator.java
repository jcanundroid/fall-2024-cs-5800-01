package com.jcanunwah.cs5800.assignment04.solution02.meals;

public class MealFactoryCreator
{
	private static MealFactoryCreator instance;

	private MealFactoryCreator() {
	}

	public static MealFactoryCreator getInstance() {
		if (instance == null) {
			instance = new MealFactoryCreator();
		}

		return instance;
	}

	public MealFactory createFactory(String type) {
		type = type.toLowerCase();

		switch (type) {
			case "unrestricted":
				return UnrestrictedMealFactory.getInstance();

			case "paleo":
				return PaleoMealFactory.getInstance();

			case "vegan":
				return VeganMealFactory.getInstance();

			case "nutless":
				return NutlessMealFactory.getInstance();
		}

		return null;
	}
}
