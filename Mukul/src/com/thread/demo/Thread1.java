package com.thread.demo;

public class Thread1 implements Runnable
{
	OneThreadPrintThreeNumber t;
	public Thread1(OneThreadPrintThreeNumber t)
	{
		this.t=t;
	}
	
	@Override
	public void run()
	{
		t.printFirstThree();
	}
}
