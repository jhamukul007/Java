package com.string.problem;

public class FirstRepectingChar 
{
	static char firstRepectingChar(String s)
	{
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					return s.charAt(i);
				}
			}
		}
		return ' ';
	}
public static void main(String[] args) 
{
	String s="abcbcdefghde";
	System.out.println("First repecting char is:"+firstRepectingChar(s));
}
}
