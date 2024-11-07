package com.jcanunwah.cs5800.assignment05.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.jcanunwah.cs5800.assignment05.food.*;

public class ToppingDecoratorTest
{
	@Test
	@DisplayName("decorated base -> base price + topping price")
	public void testDecoratedBaseHasBaseAndToppingPrice() {
		PricedItem item = new Cheeseburger();
		PricedItem decoratedItem = new PeppersDecorator(new Cheeseburger());

		double correctPrice = (new Cheeseburger()).getPrice() + (new Peppers()).getPrice();

		Assert.assertEquals(correctPrice, decoratedItem.getPrice(), 0.0);
	}
}
