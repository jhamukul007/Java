package com.callable.demo;

import java.util.concurrent.Callable;

public class Print extends Thread implements Callable 
{
	@Override
	public Object call()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
				
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		return null;
	}
	public static void main(String[] args)
	{
		Print p=new Print();
		p.start();
		
		
	}
}

