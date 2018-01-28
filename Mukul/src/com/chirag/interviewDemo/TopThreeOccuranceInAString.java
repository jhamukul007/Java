package com.chirag.interviewDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TopThreeOccuranceInAString 
{
// even it can also work as array
	// its same Algo
	
	public static void topThreeRepetedCharacter(String s)
	{
		if(s==null) {
			return;
		}
		
		char[] arr=s.toCharArray();
		Map<Character, Integer> map=new HashMap<Character,Integer>();
		for(char c:arr)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
			Comparator<Entry<Character, Integer>> cmp=new Comparator<Entry<Character, Integer>>() 
			{

				@Override
				public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) 
				{
					return o2.getValue()-o1.getValue();
				}
				
			 
			};
			List<Entry<Character, Integer>> list=new ArrayList<Entry<Character, Integer>>(map.entrySet());
			Collections.sort(list,cmp);
			int counter=1;
			for(Map.Entry<Character, Integer> entry:list)
			{
				// this is for top three Repeting Character
				/*if(counter<=3)
				{
					System.out.println(entry.getKey());
					counter++;
				}
				else
				{
					break;
				}*/
				
				// if you want to get top repeting Character then use this code 
				/*if(counter==1)
				{
					System.out.println(entry.getKey());
					counter++;
				}
				else
				{
				break;
				}
				*/
				
				// print 2nd Max repeting Character use this code
				
				 if(counter==2)
				 {
				 	System.out.println(entry.getKey());
					counter++;
				 }
				counter++;
				 
			}
			
			}
	
	public static void bottomThreeRepetingCharacter(String s)
	{

		if(s==null) {
			return;
		}
		
		char[] arr=s.toCharArray();
		Map<Character, Integer> map=new HashMap<Character,Integer>();
		for(char c:arr)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
			Comparator<Entry<Character, Integer>> cmp=new Comparator<Entry<Character, Integer>>() 
			{

				@Override
				public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) 
				{
					return o1.getValue()-o2.getValue();
				}
				
			 
			};
			List<Entry<Character, Integer>> list=new ArrayList<Entry<Character, Integer>>(map.entrySet());
			Collections.sort(list,cmp);
			int counter=1;
			
			for(Map.Entry<Character, Integer> entry: list)
			{
				// this is for least three Repeting Character
				if(counter<=3)
				{
					System.out.println(entry.getKey());
					counter++;
				}
				else
				{
					break;
				}
				
				// if you want to get least repeting Character then use this code 
				/*if(counter==1)
				{
					System.out.println(entry.getKey());
					counter++;
				}
				else
				{
				break;
				}
				*/
				
				// print 2nd least repeting Character use this code
				
				 /*if(counter==2)
				 {
				 	System.out.println(entry.getKey());
					counter++;
				 }
				 counter++;*/
			}
	}
	public static void main(String[] args) 
	{
		String s="ABABCDEFGHCABDCDCCD";
		//topThreeRepetedCharacter(s);
	bottomThreeRepetingCharacter(s);
	}
}
