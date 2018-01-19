package com.custom.arraylist;

import java.util.Arrays;

public class ArrayList<E> 
{
	private final int capacity=5;
	private int size=0;
	private Object[] element;
	
	public ArrayList()
	{
		element=new Object[capacity];
	}
	
	public boolean add(E e)
	{
		if(size==element.length)
		{
			expend();
		}
		
		element[size++]=e;
		return true;
	}
	
	private void expend()
	{
		int newCapacity=element.length*2;
		element=Arrays.copyOf(element, newCapacity);
	}
	
	public E get(int index)
	{
		if(index<0 || index>=size)
		{
			throw new IndexOutOfBoundsException("Out Of Bound");
		}
		return (E)element[index];
	}
	
	public int size()
	{
		return size;
	}
	public Object remove(int index)
	{
		if(index<0 || index>size)
		{
			throw new IndexOutOfBoundsException("Out of the Bound");
		}
		Object removedElement=element[index];
		
		for(int i=size;i<element.length-1;i++)
		{
			element[i]=element[i+1];
		}
		size--;
		return removedElement;
	}
	
	
	public void display()
	{
		System.out.print("[ ");
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+element[i]);
		}
		System.out.print(" ]");
	}
	
	public int indexof(E e)
	{
		if(e==null)
		{
			for(int i=0;i<size;i++)
			{
				if(element[i]==null)
				{
					return i;
				}
			}
		}
			else
			{
				for(int i=0;i<size;i++)
				{
					if (e.equals(element[i]))
					{
						return i;
					}
				}
			}
			return -1;
		
	}
	
	public int lastIndex(E e)
	{
		if(e==null)
		{
			for(int i=size-1;i>0;i--) 
			{
				if(element[i]==null)
				{
					return i;
				}
			}
		}
			else
			{
				for(int i=size-1;i>0;i--) 
				{
					if(e.equals(element[i]))
					{
						return i;
					}
				}
			}
		return -1;
	}
		
	
	public static void main(String[] args) 
	{
	
	ArrayList<Integer> obj=new ArrayList<Integer>();
	obj.add(10);
	obj.add(15);
	obj.add(15);
	obj.add(25);
	obj.add(50);
	obj.add(56);
	obj.add(15);
	System.out.println(obj.get(4));
	obj.display();
	
	}
}
