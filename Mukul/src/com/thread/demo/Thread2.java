package com.thread.demo;

public class Thread2 implements Runnable
{
	OneThreadPrintThreeNumber t;
	public Thread2(OneThreadPrintThreeNumber t)
	{
		this.t=t;
	}
@Override
public void run()
{
	t.printSecondThree();
}
}
