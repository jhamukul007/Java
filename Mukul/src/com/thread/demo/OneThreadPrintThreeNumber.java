package com.thread.demo;

public class OneThreadPrintThreeNumber 
{
	
	volatile int number=1;
	synchronized void printFirstThree()
	{
		int count=1;
		for(;number<=21;number++)
		{
			
			if(count==4)
			{
				
				count=1;
				notify();
				try
				{
					wait();
				}
				catch (Exception e) {
					System.out.println(e);
					// TODO: handle exception
				}
			}
			System.out.println(Thread.currentThread().getName()+": "+number);
			count++;
		}
	}
	synchronized void printSecondThree()
	{int count=1;
	
		for(;number<=21;number++)
		{
			if(count==4)
			{
				count=1;
				notify();
				
				try
				{
					wait();
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
			}
			System.out.println(Thread.currentThread().getName()+": "+number);
			count++;
		}
	}
	
}
