package com.array.dmeo;

import java.util.Arrays;

public class MissingTwoNumber
{
	public static void missingNo(int[] arr)
	{
		/*if(arr==null)
		{
			return -1;
		}
		if(arr.length==arr[arr.length]-1)
		{
			return 0;
		}
		int sum=0;
		for(int i=1;i<arr[arr.length-1];i++)
		{
			sum=sum+i;
		}
		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			sum1+=arr[i];
		}
		
		int missing=sum-sum1;
		
		for*/
		Arrays.sort(arr);
		for(int i=1;i<=arr[arr.length-1];i++)
		{
			for(int j=0;j<arr.length;i++)
			{
				if(i!=arr[j])
				{
					System.out.println("Missing no in array is:"+i);
				}
			}
		}
		
		
			
		
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,1,5,4};
	}
}
