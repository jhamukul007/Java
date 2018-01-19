package nthterm.array.demo;

import java.util.Scanner;

public class NthTerm 
{
//nth term of given array: 7,15,32,..
	
	public static int nthTerm(int first, int n)
	{
		for(int i=2;i<=n;i++)
		{
			first=first*2+(i-1);
		}
		return first;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {7,15,32};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("enter the nth term: ");
		int nth_num =nthTerm(arr[0], n );
		System.out.println(n+"th number is: "+nth_num);
	}
}
