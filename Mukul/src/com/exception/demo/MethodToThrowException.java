package com.exception.demo;

import java.io.IOException;

public class MethodToThrowException extends Exception 
{
	void doStuff() throws MethodToThrowException 
	{
		throw new MethodToThrowException();
	}
	public static void main(String[] args) throws MethodToThrowException {
		new MethodToThrowException().doStuff();
	}
}
