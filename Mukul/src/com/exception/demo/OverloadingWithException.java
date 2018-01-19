package com.exception.demo;

import java.io.IOException;

public class OverloadingWithException
{
	void go()
	{
		System.out.println("go");
	}
	void go(int i) throws IOException
	{
		System.out.println(i);
	}
	void go(float j) throws RuntimeException
	{
		System.out.println(j);
	}
	void go(boolean b) throws Exception
	{
		System.out.println(b);
	}
	public static void main(String[] args) {
		OverloadingWithException obj=new OverloadingWithException();
		obj.go();
		try
		{
			obj.go(10);
			obj.go(true);
			obj.go(12.5f);
		}
		
		catch (IOException e) 
		{
			System.out.println("go() IO");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
