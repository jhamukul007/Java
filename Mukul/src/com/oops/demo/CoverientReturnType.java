package com.oops.demo;

public class CoverientReturnType 
{

}
class A
{
	E go()
	{
		return new E();
	}
}
class B extends A
{
	F go()
	{
	return new F();
	}
}
class D
{
	
}
class E extends D
{
	
}
class F extends E
{
	
}