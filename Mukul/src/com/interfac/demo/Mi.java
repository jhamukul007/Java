package com.interfac.demo;

public class Mi implements Mobile,Camera
{
	public int battery_capacity=2500;
	
	
	public void ram()
	{
		System.out.println("4 gb ram");
	}
	public void rom()
	{
		System.out.println("64 gb rom");
	}
	public void display()
	{
		System.out.println("5.5 inch display");
	}
	public void front()
	{
		System.out.println("5 mp front camera");
	}
	public void rear()
	{
		System.out.println("13+13 Mp camera");
	}
	
	public static void main(String[] args)
	{
		Camera mobile=new Mi();
		mobile.androidVersion();
		mobile.display();
		mobile.ram();
		mobile.rom();
		mobile.front();
		mobile.rear();
		
		System.out.println("bettery capacity: "+mobile.battery_capacity);
		System.out.println("Mi bettery capacity:"+new Mi().battery_capacity);
	
	}
}
