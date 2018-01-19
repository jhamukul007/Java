package com.design.pattern.builderdesignpattern.demo;

public abstract class ColdDrink implements Item
{
	@Override
	public Packing packing()
	{
		return (Packing) new Bottle();
	}
	@Override
	public abstract float price();
}
