package com.thread.demo.evenodd;

public class Thread2 implements Runnable
{
	 EvenOdd obj;
	public Thread2(EvenOdd obj)
	{
	this.obj=obj;
	}
	@Override
	public void run()
	{
		obj.odd();
	}
}
