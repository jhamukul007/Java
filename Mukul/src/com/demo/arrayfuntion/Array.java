package com.demo.arrayfuntion;

public class Array 
{
	static int[] arr;
	static int[] subArray;
	static int getIndex(int element)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				return i;
			}
			
		}
		return -1;
	}
	
	static Object getElement(int index)
	{
		if(index<0 || index>=arr.length)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		return arr[index];
	}
	/*static Object[] sort()
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				{
					
				}
			}
		}
	}*/
	
	static int maxElement()
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
		 if(arr[i]>max)
		 {
			 max=arr[i];
		 }
		 
		}
		return max;
	}
	
	static int getMin()
	{
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	
	static int midElement()
	{
		//int mid=(arr.length/2);
		return arr[arr.length/2];
	}
	
	static int size()
	{
		return arr.length;
	}
	
	static int[] subArray(int startIndex, int lastIndex)
	{
		int index=0;
		if(checkIndex(startIndex,lastIndex)==true)
		{
			for(int i=startIndex;i<lastIndex;i++)
			{
				subArray[index++]=arr[i];
			}
		}
		return subArray;
	}
	
	static boolean checkIndex(int s,int l)
	{
		if(s<0 || l>=arr.length)
		{
			return false;
		}
		return true;
	}
	
	
	public static void main(String[] args)
	{
		
		
	}
	
}
