package com.array.dmeo;

import java.util.Scanner;

public class Sumofpairofnumber 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	int num=sc.nextInt();
	int[] arr= {1,2,3,4,5,6,7,8,9};
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]+arr[j]==num)
			{
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}
	
}
}
