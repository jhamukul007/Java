package com.thread.demo;

public class JoinDemo implements Runnable
{

int[] arr=new int[] {12,10,15,15,8,78,45,98,78,45,778};
@Override
public void run()
{
	
	int max=0;
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(Thread.currentThread().getName());
		if(arr[i]>max)
		{
			max=arr[i];
			try
			{
				
				Thread.sleep(1000);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
	}
	System.out.println(max);
}
public static void main(String[] args) throws InterruptedException
{
	JoinDemo obj=new JoinDemo();
	Thread t1=new Thread(obj,"Thread-1");
	Thread t2=new Thread(obj,"Thread-2");
	Thread t3=new Thread(obj,"Thread-3");
	
	t3.join();
	t1.start();
	t2.join();
	t2.start();
	t3.start();
	
}

}
