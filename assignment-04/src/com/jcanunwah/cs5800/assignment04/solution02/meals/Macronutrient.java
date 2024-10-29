package com.jcanunwah.cs5800.assignment04.solution02.meals;

public class Macronutrient
{
	public static final String CARBS = "carbs";
	public static final String PROTEINS = "proteins";
	public static final String FATS = "fats";

	public static final String UNRESTRICTED = "unrestricted";
	public static final String PALEO = "paleo";
	public static final String VEGAN = "vegan";
	public static final String NUTLESS = "nutless";

	public static final Macronutrient[] CARBS_OPTIONS = {
		new Macronutrient("Cheese", new String[] { "paleo", "vegan" }),
		new Macronutrient("Bread", new String[] { "paleo" }),
		new Macronutrient("Lentils", new String[] { "paleo" }),
		new Macronutrient("Pistachios", new String[] { "nutless" })
	};

	public static final Macronutrient[] PROTEINS_OPTIONS = {
		new Macronutrient("Fish", new String[] { "vegan" }),
		new Macronutrient("Chicken", new String[] { "vegan" }),
		new Macronutrient("Beef", new String[] { "vegan" }),
		new Macronutrient("Tofu", new String[] { "paleo" })
	};

	public static final Macronutrient[] FATS_OPTIONS = {
		new Macronutrient("Avocado", new String[] {}),
		new Macronutrient("Sour Cream", new String[] { "paleo", "vegan" }),
		new Macronutrient("Tuna", new String[] { "vegan" }),
		new Macronutrient("Peanuts", new String[] { "nutless" })
	};

	private String name;
	private String[] disallowedDiets;

	public Macronutrient(String name, String[] disallowedDiets) {
		this.name = name;
		this.disallowedDiets = disallowedDiets;
	}

	public String getName() {
		return this.name;
	}

	public String[] getDisallowedDiets() {
		return this.disallowedDiets;
	}
}
