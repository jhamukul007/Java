package com.string.problem;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate 
{
	public static String remove(String str)
	{
		char[] ch=str.toCharArray();
		String s="";
		Set<Character> set=new LinkedHashSet<Character>();
		for(char c:ch)
		{
			set.add(c);
		}
		for(char c:set)
		{
			s=s+c;
		}
		return s;
		
	}
	
	public static String newReplace(String s)
	{
		 String s2 = "";
	        for (int i = 0; i < s.length(); i++) {
	            Boolean found = false;
	            for (int j = 0; j < s2.length(); j++) {
	                if (s.charAt(i) == s2.charAt(j)) {
	                    found = true;
	                    break; //don't need to iterate further
	                }
	            }
	            if (found == false) {
	                s2 = s2.concat(String.valueOf(s.charAt(i)));
	            }
	        }
	        return s2;
	}
	public static void main(String[] args) {
		String s="aabbccdefatafaz";
		//System.out.println(remove(s));
		//System.out.println(newReplace(s));
	}
	
	
}
