package com.string.problem;

public class FirstNonRepetingCharecter 
{
public static void NonRepetingChar(String s)
{
	boolean flag=false;
	int count=1;
	System.out.println("Non Repeting Charecter is: ");
	
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				flag=true;
			}
		
		}	
		if(flag==false && count==1)
		{
			System.out.println(s.charAt(i));
			count++;
		}
	}
}
public static void main(String[] args)
{
	String s="adjsdhja";
	NonRepetingChar(s);
}
}
