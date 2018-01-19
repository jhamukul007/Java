package com.interfece.demo;

public interface InterfaceDemos
{	
	int i=10;
	void go();
	void sum();
	default void walk()
	{
		System.out.println("default");
	}
}
