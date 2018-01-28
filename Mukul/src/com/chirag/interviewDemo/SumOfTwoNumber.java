package com.chirag.interviewDemo;

public class SumOfTwoNumber 
{
		public static void pairOfSum(int[] arr, int n)
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]+arr[j]==n)
					{
						System.out.println("("+arr[i]+","+arr[j]+")");
					}
				}
			}
		}
		
		
		public static void SecMax(int[] arr)
		{
			int max=0;
			int secMax=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>max)
				{
					secMax=max;
					max=arr[i];
				}
				if(arr[i]>secMax && arr[i]!=max)
				{
					secMax=arr[i];
				}
			}
			System.out.println("Max in the Array:"+max);
			System.out.println("Second max in the Array:"+secMax);
		}
		
		public static void topThreeNumber(int[] arr)
		{
			int max=0;
			int secMax=0;
			int thrMax=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>max)
				{
					thrMax=secMax;
					secMax=max;
					max=arr[i];
				}
				if(arr[i]>secMax && arr[i]!=max)
				{
					thrMax=secMax;
					secMax=arr[i];	
				}
				if(arr[i]>thrMax && arr[i]<secMax)
				{
					thrMax=arr[i];
				}
				
				
			}
			System.out.println("Top Three Number in a Array: "+max+","+secMax+","+thrMax);
		}
		public static void secMin(int[] arr)
		{
			int min=arr[0];
			int secMin=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<min)
				{
					secMin=min;
					min=arr[i];
					
				}
				if(arr[i]<secMin && arr[i]!=min)
				{
					secMin=arr[i];
				}
			}
			System.out.println("Min Element in a Array: "+min);
			System.out.println("Second Min Element in Array: "+secMin);
		}
		
		
		
		public static void main(String[] args) 
		{
			int[] arr= {3,5,5,7,8,2,6,90,45,2,80,75,82,92};
		//	pairOfSum(arr, 10);
			//SecMax(arr);
			//secMin(arr);
			topThreeNumber(arr);
			
			
		}
}
