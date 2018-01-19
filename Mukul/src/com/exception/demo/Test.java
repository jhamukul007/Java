package com.exception.demo;

public class Test 
{
	void test(String s)
	{
		System.out.println("String");
	}
	void test(Object o)
	{
		System.out.println("Object");
	}
	
	/*
	void test(Integer i)
	{
		System.out.println("Int");
	}*/
	public static void main(String[] args) {
		new Test().test(null);
	}

}
