package com.thread.demo.evenodd;

public class Thread1 implements Runnable
{
	 EvenOdd obj;
	public Thread1(EvenOdd obj)
	{
		this.obj=obj;
	}
	@Override
	public void run()
	{
		obj.even();
	}
}
