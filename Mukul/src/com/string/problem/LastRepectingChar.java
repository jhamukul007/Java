package com.string.problem;

public class LastRepectingChar 
{
public static char lastRepectingChar(String s)
{
	for(int i=s.length()-1;i>0;i--)
	{
		for(int j=0;j<i;j++)
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
	String s="abcbcdfghde";
	System.out.println("Last Repeting Char:"+lastRepectingChar(s));
}
}
