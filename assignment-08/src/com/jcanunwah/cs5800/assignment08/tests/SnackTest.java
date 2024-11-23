package com.jcanunwah.cs5800.assignment08.vending;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class SnackTest
{
	@Test
	@DisplayName("get zero quantity snack -> null")
	public void testThing() {
		Snack snack = new Snack("snack", 0.0, 0);

		Assert.assertEquals(null, snack.get("snack"));
	}
}
