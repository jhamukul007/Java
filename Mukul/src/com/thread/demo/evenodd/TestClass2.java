package com.thread.demo.evenodd;

public class TestClass2 {
public static void main(String[] args)
{
	EvenOdd obj=new EvenOdd();
	Thread1 o=new Thread1(obj);
	Thread2 o1=new Thread2(obj);
	Thread t1=new Thread(o,"Even Thread");
	Thread t2=new Thread(o1,"Odd Thread");
	t1.start();
	t2.start();
	
}
}
