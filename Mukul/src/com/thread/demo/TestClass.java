package com.thread.demo;

public class TestClass 
{
public static void main(String[] args)
{
	OneThreadPrintThreeNumber t=new OneThreadPrintThreeNumber();
	Thread1 obj1=new Thread1(t);
	Thread2 obj2=new Thread2(t);
	Thread t1=new Thread(obj1,"Thread1");
	Thread t2=new Thread(obj2,"Thread2");
	t1.start();
	t2.start();
	
}
}
