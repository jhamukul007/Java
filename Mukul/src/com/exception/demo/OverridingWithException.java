package com.exception.demo;

public class OverridingWithException extends Exception
{
public static void main(String[] args)// throws PException,QException
{try
{
	Test1 t=new Test1();
	t.go();
	QTest t1=new Test1();
	t1.go();
}
catch(PException p)
{
	System.out.println(p);
}
	
}
}
class PException extends OverridingWithException
{
	

}
class QException extends PException
{
	
}

class QTest
{
	void go() throws PException
	{
		System.out.println("go in parent");
	}
}
class Test1 extends QTest
{
	void go() throws QException
	{
		System.out.println("child with exception");
	}
}
