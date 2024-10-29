package com.jcanunwah.cs5800.assignment04.solution02.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import com.jcanunwah.cs5800.assignment04.solution02.meals.*;

public class MacronutrientFactoryTest
{
	private MacronutrientFactory mnFactory;

	@BeforeEach
	public void prepareTest() {
		this.mnFactory = MacronutrientFactory.getInstance();
	}

	@Test
	@DisplayName("createMacronutrient: carbs and paleo -> pistachio")
	public void testCreateMacronutrientCarbsPaleoIsPistachio() {
		Assert.assertEquals(
			this.mnFactory.createMacronutrient(Macronutrient.CARBS, Macronutrient.PALEO).getName(),
			"Pistachios"
		);
	}

	@Test
	@DisplayName("createMacronutrient: protein + vegan -> tofu")
	public void testCreateMacronutrientProteinVeganIsTofu() {
		Assert.assertEquals(
			this.mnFactory.createMacronutrient(Macronutrient.PROTEINS, Macronutrient.VEGAN).getName(),
			"Tofu"
		);
	}

	@Test
	@DisplayName("createMacronutrient: invalid type -> null")
	public void testCreateMacronutrientInvalidTypeIsNull() {
		Assert.assertEquals(
			this.mnFactory.createMacronutrient("", Macronutrient.VEGAN),
			null
		);
	}
}
