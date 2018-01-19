package com.design.pattern.builderdesignpattern.demo;

public class VegBurger extends Burger
{
	@Override
	public float price()
	{
		return 33.5f;
	}
	
	@Override
	public String name()
	{
		return "Veg Burger";
	}
}
