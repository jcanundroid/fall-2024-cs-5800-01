package com.jcanunwah.cs5800.assignment05.food;

public class DoubleMeatDecorator extends BaseItemDecorator
{
	public DoubleMeatDecorator(PricedItem decoratedBase) {
		super(decoratedBase, new DoubleMeat());
	}
}
