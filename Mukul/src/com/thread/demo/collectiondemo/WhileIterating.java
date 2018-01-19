package com.thread.demo.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WhileIterating 
{
	public static void main(String[] args)
	{
		//List<Integer> list=new ArrayList<Integer>();
		CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<Integer>();
		for(int i=1;i<5;i++)
		{
			list.add(i);
		}
		
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			if(i==1)
			{
				list.add(15);
			}
			System.out.println(i);
			
		}
		System.out.println(list);
	}
}
