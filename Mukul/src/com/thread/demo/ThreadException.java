package com.thread.demo;

public class ThreadException extends Thread
{
	public void run() throws NullPointerException
	{
		System.out.println("hi");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
	}
	}
}
