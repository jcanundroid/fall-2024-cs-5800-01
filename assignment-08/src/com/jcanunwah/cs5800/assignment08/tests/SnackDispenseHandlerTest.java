package com.jcanunwah.cs5800.assignment08.vending;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class SnackDispenseHandlerTest
{
	@Test
	@DisplayName("chain uses next")
	public void testChainNext() {
		SnackDispenseHandler handler = new SnackDispenseHandler(new Snack[] {
			Snack.Pepsi, Snack.Snickers
		});

		Snack snack = handler.get(Snack.Snickers.getName());

		if (snack == null) {
			Assert.fail();
		}

		Assert.assertEquals(Snack.Snickers.getName(), snack.getName());
	}
}
