package com.array.dmeo;

public class SubStringDemo
{
public static int maxSum(int[] arr,int n)
{
	int sum=0;
	int max=0;
	for(int i=0;i<arr.length-n;i++)
	{
		for(int j=i;j<i+n;j++)
		{
			sum=sum+arr[j];
		}
		if(sum>max)
		{
			max=sum;
			sum=0;
		}
		sum=0;
	}
	return max;
}
public static void main(String[] args) {
	int[] arr= {5,7,8,1,2,10,7,5};
	System.out.println(maxSum(arr,4));
}
}
