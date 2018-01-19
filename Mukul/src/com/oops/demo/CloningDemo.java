package com.oops.demo;

public class CloningDemo implements Cloneable
{
	int roll;
	int month;
	public CloningDemo(int roll,int month)
	{
		this.roll=roll;
		this.month=month;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		CloningDemo obj=new CloningDemo(10,12);
		CloningDemo obj1=(CloningDemo)obj.clone();
		System.out.println(obj.month);
		System.out.println(obj1.month);
		System.out.println(obj.roll);
		System.out.println(obj1.roll);
	}
}
