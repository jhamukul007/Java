package com.exception.demo;

public class ExceptionChild extends Exception
{
public static void main(String[] args) 
{
	 TestGo t=new TestGo();
	 try
	 {
		 t.go();
		 t.go(12.5f);
		 t.go(10);
	 }
	 catch(ExceptionChild e)
	 {
		 System.out.println(e);
	 }
}
}
class newException extends ExceptionChild
{
	
}
class newException1 extends newException
{
	
}

class TestGo
{
	void go() throws ExceptionChild
	{
		System.out.println("go");
	}
	void go(int i) throws newException
	{
		System.out.println("go(int)");
	}
	void go(float f) throws newException
	{
		System.out.println("go(float)");
	}
			
}
