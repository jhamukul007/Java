package com.zoomacar.demo;

public class Client implements E,F

{
	
	public static void main(String[] args)
	{
		System.out.println(new C().i);
		F obj=new Client();
		System.out.println(obj.i);
	}
}
interface F
{
	String i="kdsjn";
}
interface E
{
	int i=10;
}
