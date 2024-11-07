package com.jcanunwah.cs5800.assignment05.food;

public class PeppersDecorator extends BaseItemDecorator
{
	public PeppersDecorator(PricedItem decoratedBase) {
		super(decoratedBase, new Peppers());
	}
}
