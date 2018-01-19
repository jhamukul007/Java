package com.string.problem;

public class FindTheLongestSubstring 
{
	String base="YHKKGFFADGJJJ";
	String search="ADGFFF";
	String orignal="";
	String temp="";
	int index=0;
	public void subString()
	{
		for(int i=0;i<base.length();i++)
		{
			index=i;
			for(int j=0;j<search.length();j++)
			{
				if(base.charAt(i)==search.charAt(j))
				{
					temp+=base.charAt(i);
					i++;
					
					if(temp.length()>orignal.length())
					{
						orignal=temp;
						temp="";
					}
				}
			}
			temp="";
			i=index;
		}
		
		System.out.println(orignal);
	}
	public static void main(String[] args) 
	{
		new FindTheLongestSubstring().subString();
	}
}
