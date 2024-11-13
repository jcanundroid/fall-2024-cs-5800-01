package com.jcanunwah.cs5800.assignment06.solution01.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.jcanunwah.cs5800.assignment06.solution01.editor.*;

public class CharacterPropertyFactoryTest
{
	@Test
	@DisplayName("invalid type + value -> null")
	public void testInvalidTypeValueIsNull() {
		CharacterPropertyFactory factory = new CharacterPropertyFactory();

		Assert.assertEquals(null, factory.getProperty("", ""));
	}

	@Test
	@DisplayName("type + value -> correct property")
	public void testTypeValueIsCorrect() {
		CharacterPropertyFactory factory = new CharacterPropertyFactory();

		ColorRed property = new ColorRed();
		CharacterProperty testProperty = factory.getProperty("color", "Red");

		Assert.assertEquals(property.getType(), testProperty.getType());
		Assert.assertEquals(property.getValue(), testProperty.getValue());
	}
}
