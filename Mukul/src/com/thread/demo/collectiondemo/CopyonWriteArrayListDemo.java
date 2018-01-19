package com.thread.demo.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWriteArrayListDemo implements Runnable
{
	CopyOnWriteArrayList<String> list1=new CopyOnWriteArrayList<String>();
	//ArrayList<String> list=new ArrayList<String>();
		@Override
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				list1.add(Thread.currentThread().getName()+":"+i);
			}
		}
		
		void get()
		{
			Iterator<String> itr=list1.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
		}
		public static void main(String[] args) {
			CopyonWriteArrayListDemo t=new CopyonWriteArrayListDemo();
			Thread t1=new Thread(t,"Thread 1");
			Thread t2=new Thread(t,"Thread 2");
			t1.start();
			t2.start();
			t.get();
		}
}
