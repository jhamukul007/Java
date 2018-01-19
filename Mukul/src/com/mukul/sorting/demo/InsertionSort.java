package com.mukul.sorting.demo;

public class InsertionSort 
{
public static void main(String[] args) {
	int[] arr= {1,5,9,8,2,0,15,4,19};
	
  	for(int i=1;i<arr.length;++i)
	{
		int key=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>key)
		{
			
			
				/*int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;*/
				arr[j+1]=arr[j];
				j=j-1;
		}
			arr[j+1]=key;
		}
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
