package com.interfece.demo;

public class IterfaceDemo implements InterfaceDemos
{
	int j=i+1;
	public void go()
	{
		System.out.println("go");
		
	}
	public void walk()
	{
		System.out.println("walk");
	}
	
	public void sum()
	{
		System.out.println("its sum");
	}
	public static void main(String[] args) {
		InterfaceDemos itr=new IterfaceDemo();
		//System.out.println(itr.j);
		itr.walk();
	}
}
