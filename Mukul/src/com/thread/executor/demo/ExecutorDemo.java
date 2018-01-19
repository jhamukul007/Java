package com.thread.executor.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo
{
	public static void main(String[] args)
	{
		Runnable t1=new RunnableDmeo();
		Runnable t2=new RunnableDmeo();
		Runnable t3=new RunnableDmeo();
		Runnable t4=new RunnableDmeo();
		Runnable t5=new RunnableDmeo();
		Runnable t6=new RunnableDmeo();
		Runnable t7=new RunnableDmeo();
		List<Runnable> list=new ArrayList<Runnable>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		
		ExecutorService executor=Executors.newFixedThreadPool(3);
		Iterator<Runnable> itr=list.iterator();
		while(itr.hasNext())
		{
			executor.execute(itr.next());
		}
		
		executor.shutdown();
	}
	
}
