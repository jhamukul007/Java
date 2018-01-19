package com.exception.demo;

public class EException extends Exception
{
	void doSuff() throws EException
	{
		go();
	}
	void go() throws EException
	{
		/*try
		{
			throw new EException();
		}
		catch (Exception e) {
			System.out.println("run sucessfully");
		}*/
		System.out.println("not running");
	}
	
	void live() throws Exception
	{
		System.out.println("Live");
	}
	public static void main(String[] args) {
		//new EException().doSuff();
		/*try {
			new EException().live();
		} catch (Exception e) 
		{
			System.out.println(e);
		}
		*/
		try {
			new EException().live();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

