package com.thread.demo.evenodd;

public class EvenOdd 
{
	volatile int number=1;
	synchronized public  void even()
	{
		for(;number<20;number++)
		{
			if((number%2)==0)
			{
				System.out.println(Thread.currentThread().getName()+": "+number);
			}
				notify();
				try
				{
					
					wait();
				}
				catch (InterruptedException e)
				{
					System.out.println(e);
				}
			
		}
	}
	synchronized public void odd()
	{
		for(;number<20;number++)
		{
			if((number%2)!=0)
			{
				System.out.println(Thread.currentThread().getName()+": "+number);
			}
			
				notify();
				try
				{
					wait();
				}
				catch (InterruptedException e) 
				{
				 e.printStackTrace();
				}
				
			
		}
	}
	
}
