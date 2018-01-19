package com.design.pattern.builderdesignpattern.demo;

public class NonVegBurger extends Burger
{
	@Override
	public float price()
	{
		return 64f;
	}
	
	@Override
	public String name()
	{
		return "Chicken Burger";
	}
}
