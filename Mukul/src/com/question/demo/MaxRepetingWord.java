package com.question.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
//import java.util.List.*;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Map.Entry;
import java.util.*;
//import com.custom.arraylist.ArrayList;

public class MaxRepetingWord 
{
	public static void mostRepetingWord(String s)
	{
		if(s==null)
		{
			return;
		}
		
		String[] arr=s.split(" ");
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(String s1:arr)
		{
			if(map.containsKey(s1))
			{
				map.put(s1, map.get(s1)+1);
			}
			else
			{
				map.put(s1,1);
			}
		}
		
		
		
		Comparator<Entry<String,Integer>> cmp=new Comparator<Entry<String,Integer>>()
		{

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
			{
				if(o1.getValue()==o2.getValue())
				{
					return o2.getKey().compareTo(o1.getKey());
				}
				return o2.getValue()-o1.getValue();
			}
			
		};
		ArrayList<Entry<String,Integer>> list=new ArrayList<Entry<String,Integer>>(map.entrySet());
		Collections.sort(list, cmp);
		for(Map.Entry<String,Integer> entry:list)
		{
			System.out.println(entry.getKey());
		}
		
		
		
		
	}
	public static void main(String[] args) 
	{
		String s="patna bihar delhi delhi bangalore kolkata patna delhi patna bihar kolkata patna mumbai";
		mostRepetingWord(s);
	}
}
