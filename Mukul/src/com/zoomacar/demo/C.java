package com.zoomacar.demo;

public class C implements A,B
{
	public static void main(String[] args)
	{
		A a=new C();
		System.out.println(a.i);
		
		/*B b=(B)a;
		System.out.println(b.i);*/
		B b=new B();
		System.out.println(b.i);
	}
}

interface A
{
	int i=10;
}

interface B
{
	//int i=20;
	//String i="jkfhjd";
}


class D
{
	
}