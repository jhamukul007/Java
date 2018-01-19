package com.interfac.demo;

public interface Mobile 
{
	int battery_capacity=3010;
	//void camera();
	default void androidVersion()
	{
		System.out.print("android version:  Oreo 8.0");
	}
	void ram();
	void rom();
	void display();
}
