package com.jcanunwah.cs5800.assignment05.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.jcanunwah.cs5800.assignment05.food.*;

public class OrderTest
{
	@Test
	@DisplayName("empty order -> zero price")
	public void testEmptyOrderHasZeroPrice() {
		Order order = new Order(
			new Customer("", false),
			new PricedItem[] {}
		);

		Assert.assertEquals(0.0, order.getPrice(), 0.0);
	}

	@Test
	@DisplayName("order with item -> item price")
	public void testSingleItemOrderHasItemPrice() {
		Order order = new Order(
			new Customer("", false),
			new PricedItem[] {
				new Cheeseburger()
			}
		);

		double correctPrice = (new Cheeseburger()).getPrice();

		Assert.assertEquals(correctPrice, order.getPrice(), 0.0);
	}

	@Test
	@DisplayName("order with items -> sum of items' prices")
	public void testMultiItemOrderHasItemsPrices() {
		Order order = new Order(
			new Customer("", false),
			new PricedItem[] {
				new Cheeseburger(),
				new Pizza()
			}
		);

		double correctPrice = (new Cheeseburger()).getPrice() + (new Pizza()).getPrice();

		Assert.assertEquals(correctPrice, order.getPrice(), 0.0);
	}
}
