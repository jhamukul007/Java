package com.thread.executor.demo;

public class RunnableDmeo implements Runnable
{
	volatile int count=0;
@Override
public void run()
{
	count++;
	System.out.println("Started Thread: "+count);
}
}