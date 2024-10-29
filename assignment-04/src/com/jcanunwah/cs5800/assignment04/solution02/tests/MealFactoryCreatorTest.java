package com.jcanunwah.cs5800.assignment04.solution02.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import com.jcanunwah.cs5800.assignment04.solution02.meals.*;

public class MealFactoryCreatorTest
{
	private MealFactoryCreator mfCreator;

	@BeforeEach
	public void prepareTest() {
		this.mfCreator = MealFactoryCreator.getInstance();
	}

	@Test
	@DisplayName("createFactory: invalid type -> null")
	public void testCreateFactoryInvalidTypeIsNull() {
		Assert.assertEquals(this.mfCreator.createFactory(""), null);
	}
}
