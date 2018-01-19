package com.string.problem;

public class TopThreeRepectingCHar 
{
public static char[] topThreeRepetingChar(String s)
{
	char[] repectingChar =new char[3];
	int index=0;
	for(int i=0;i<s.length()-1;i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				if(index<3)
				{
				repectingChar[index++]=s.charAt(i);
				}
				
				
			}
		}
	}
	return repectingChar;
}
public static void main(String[] args) 
{
	String s="abcbcdefghdeb";
	char[] arr=topThreeRepetingChar(s);
	System.out.print("First Three Repeting Char is: ");
	for(int i=0;i<3;i++)
	{
		System.out.print(arr[i]+",");
	}
}
}
