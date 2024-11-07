package com.jcanunwah.cs5800.assignment05.food;

public class ExtraCheeseDecorator extends BaseItemDecorator
{
	public ExtraCheeseDecorator(PricedItem decoratedBase) {
		super(decoratedBase, new ExtraCheese());
	}
}
